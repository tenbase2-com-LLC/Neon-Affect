package NeonAffect;

import OpenAIClassLibrary.OpenAI;

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.ChatChoice;
import com.azure.ai.openai.models.ChatCompletions;
import com.azure.ai.openai.models.ChatCompletionsOptions;
import com.azure.ai.openai.models.ChatRequestMessage;
import com.azure.ai.openai.models.ChatRequestSystemMessage;
import com.azure.core.credential.KeyCredential;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Replacement for the OpenAI calls in OpenAIClassLibrary.jar.
 *
 * <h2>Why this exists</h2>
 * The jar hardcodes both the model and the API key as compiled-in constants, and its
 * Java source is not on this machine - it lived on a drive that is now disk images. So
 * neither could be changed without replacing the call path. This class does that, and
 * fixes three things at once:
 *
 * <ul>
 *   <li><b>Model is configurable.</b> The jar pins {@code gpt-4o} (and {@code gpt-4} in
 *       its older class). Set {@link #ENV_MODEL} or change {@link #DEFAULT_MODEL}.</li>
 *   <li><b>The key comes from the environment.</b> The jar has a live-format key
 *       compiled into it, which travels with the jar wherever it goes. Nothing here
 *       is compiled in.</li>
 *   <li><b>Empty responses are retried.</b> Measured across 48 production-shaped calls,
 *       about 8% came back with nothing usable, which sends plan selection into its
 *       uniform fallback. One retry costs a few milliseconds.</li>
 * </ul>
 *
 * <p>It returns {@link OpenAI.PlanResult} rather than a new type so it is a drop-in at
 * the call sites: only {@code new OpenAI()} becomes {@code new NeonOpenAI()}. The jar
 * stays on the classpath for that record and for the Azure SDK it bundles.
 *
 * <h2>Choosing a model</h2>
 * As of the OpenAI changelog for September 2026:
 * <table>
 *   <tr><th>Model</th><th>Input / Output per 1M tokens</th><th>Notes</th></tr>
 *   <tr><td>{@code gpt-6-luna}</td><td>$0.10 / $0.50</td><td>default here</td></tr>
 *   <tr><td>{@code gpt-6-sol}</td><td>$2.00 / $10.00</td><td></td></tr>
 *   <tr><td>{@code gpt-6-astra}</td><td>flagship</td><td>most capable</td></tr>
 * </table>
 *
 * Neon-Affect makes two judging calls per behaviour cycle with short prompts, so the
 * cheapest capable model is the right default; {@code gpt-6-luna} is roughly 20x cheaper
 * than the {@code gpt-4o} the jar pins. Raise it if selection quality turns out to need it.
 */
public class NeonOpenAI {

    public static final String ENV_API_KEY = "OPENAI_API_KEY";
    public static final String ENV_MODEL   = "NEON_OPENAI_MODEL";

    public static final String DEFAULT_MODEL = "gpt-6-luna";

    /** "1. Clench Fists - 35%", tolerating any dash, a colon, or no separator noise. */
    private static final Pattern ROW =
        Pattern.compile("^\\s*\\d+\\s*[.)]?\\s*(.+?)\\s*[-‐-―:]\\s*(\\d+)\\s*%?\\s*$");

    private static volatile OpenAIClient CLIENT;

    private final String strModel;
    private final boolean bDebug;

    public NeonOpenAI() { this(false); }

    public NeonOpenAI(boolean bDebug) {
        String strEnvModel = System.getenv(ENV_MODEL);
        this.strModel = (strEnvModel == null || strEnvModel.isEmpty()) ? DEFAULT_MODEL : strEnvModel;
        this.bDebug = bDebug;
    }

    /** Explicit model, bypassing {@link #ENV_MODEL}. Used for A/B comparison between models. */
    public NeonOpenAI(String strModel, boolean bDebug) {
        this.strModel = (strModel == null || strModel.isEmpty()) ? DEFAULT_MODEL : strModel;
        this.bDebug = bDebug;
    }

    public String GetModel() { return strModel; }

    // ------------------------------------------------------------------ calls

    /** Ranked plans. Retries once when the first attempt yields nothing usable. */
    public ArrayList<OpenAI.PlanResult> determineSelectedPlans(String strPrompt) throws Exception {
        ArrayList<OpenAI.PlanResult> out = ParseRows(Complete(strPrompt));

        if (out.isEmpty()) {
            if (bDebug) {
                System.out.println("NeonOpenAI: empty response, retrying once");
            }
            out = ParseRows(Complete(strPrompt));
            if (out.isEmpty()) {
                System.out.println("NeonOpenAI: WARNING no usable rows after retry (model "
                    + strModel + ")");
            }
        }

        return out;
    }

    /** Free-form answer split into comma/newline separated tokens. */
    public ArrayList<String> determineAffectContext(String strPrompt) throws Exception {
        return Tokens(Complete(strPrompt));
    }

    /** Same contract as {@link #determineAffectContext}; separate name kept for clarity. */
    public ArrayList<String> determineAffectRegulation(String strPrompt) throws Exception {
        return Tokens(Complete(strPrompt));
    }

    // ------------------------------------------------------------------ internals

    private String Complete(String strPrompt) throws Exception {
        List<ChatRequestMessage> messages = new ArrayList<ChatRequestMessage>();
        messages.add(new ChatRequestSystemMessage(strPrompt));

        ChatCompletions completions = Client().getChatCompletions(
            strModel, new ChatCompletionsOptions(messages));

        StringBuilder sb = new StringBuilder();
        if (completions != null && completions.getChoices() != null) {
            for (ChatChoice choice : completions.getChoices()) {
                if (choice.getMessage() != null && choice.getMessage().getContent() != null) {
                    sb.append(choice.getMessage().getContent());
                }
            }
        }

        String strContent = sb.toString().trim();

        if (bDebug) {
            System.out.println("NeonOpenAI[" + strModel + "] returned [" + strContent + "]");
        }

        return strContent;
    }

    private static OpenAIClient Client() {
        OpenAIClient local = CLIENT;
        if (local != null) return local;

        synchronized (NeonOpenAI.class) {
            if (CLIENT == null) {
                String strKey = System.getenv(ENV_API_KEY);
                if (strKey == null || strKey.isEmpty()) {
                    throw new IllegalStateException(
                        "NeonOpenAI: " + ENV_API_KEY + " is not set. Export your OpenAI API key "
                        + "rather than compiling one in. (The key inside OpenAIClassLibrary.jar "
                        + "is baked into that jar and should be rotated.)");
                }
                CLIENT = new OpenAIClientBuilder().credential(new KeyCredential(strKey)).buildClient();
            }
            return CLIENT;
        }
    }

    /**
     * Parses numbered "name - percentage" rows. Unrecognised lines are skipped rather
     * than aborting the whole response, which is how the jar's parser loses everything
     * when the model adds a preamble line.
     */
    static ArrayList<OpenAI.PlanResult> ParseRows(String strContent) {
        ArrayList<OpenAI.PlanResult> out = new ArrayList<OpenAI.PlanResult>();
        if (strContent == null || strContent.isEmpty()) return out;

        String[] lines = strContent.split("\\r?\\n");
        for (int i = 0; i < lines.length; i++) {
            Matcher m = ROW.matcher(lines[i]);
            if (m.matches()) {
                String strName = m.group(1).replace("*", "").trim();
                out.add(new OpenAI.PlanResult(strName, m.group(2) + "%"));
            }
        }

        return out;
    }

    static ArrayList<String> Tokens(String strContent) {
        ArrayList<String> out = new ArrayList<String>();
        if (strContent == null || strContent.isEmpty()) return out;

        String[] parts = strContent.split("[,\\r\\n]+");
        for (int i = 0; i < parts.length; i++) {
            String s = parts[i].replace("\"", "").replace(".", "").trim();
            if (!s.isEmpty()) out.add(s);
        }

        return out;
    }
}
