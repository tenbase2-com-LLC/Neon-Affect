package NeonAffect;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * {@link DecisionJudge} backed by TypeSafe's Jev, a hosted decision-only judging model.
 *
 * <p>Jev takes application state plus typed questions and returns a typed answer with
 * probabilities rather than generated prose. That matters here for two reasons beyond
 * cost: a typed result cannot come back reordered, truncated or unparseable the way a
 * numbered list in free text can, and it returns the full distribution, which is what
 * {@link PlanSelectionResolver} needs to set PLAN_VALUE proportionally.
 *
 * <h2>Wire format</h2>
 * Implements {@code POST /v1/systemone} as documented at https://docs.typesafe.ai/api.
 *
 * <pre>
 * request  { "state": {...}, "model": "jev-latest",
 *            "questions": { "selection": { "type": "choice",
 *                                          "instructions": "...",
 *                                          "criteria": { "Clench Fists": null, ... } } } }
 *
 * response { "answers": { "selection": { "choice": "Clench Fists",
 *                                        "probabilities": { "Clench Fists": 0.88, ... },
 *                                        "confidence": 0.81 } } }
 * </pre>
 *
 * <p>{@code criteria} maps an option name to a description, and the description may be
 * null where the names speak for themselves - which Neon-Affect's plan names do
 * ("Staring Down Rage", "Holding Back Criticism"). Choice accepts up to 255 options; the
 * largest capability here offers 37, so the candidate list always fits in one question.
 *
 * <h2>Configuration</h2>
 * Reads {@link #ENV_API_KEY}, and optionally {@link #ENV_ENDPOINT} and {@link #ENV_MODEL}.
 * Nothing is compiled in - the OpenAIClassLibrary jar has a key baked into it, and a
 * credential inside a distributable jar should not be repeated here.
 *
 * <p>Access is early-access waitlisted direct, but Jev is also reachable through
 * OpenRouter and similar gateways; point {@link #ENV_ENDPOINT} at whichever you use.
 *
 * <p>This has been written against the published specification but has <em>not</em> been
 * executed against the live service - no key was available at the time. Treat the first
 * real call as the test.
 */
public class JevDecisionJudge implements DecisionJudge {

    public static final String ENV_ENDPOINT = "NEON_JEV_ENDPOINT";
    public static final String ENV_API_KEY  = "NEON_JEV_API_KEY";
    public static final String ENV_MODEL    = "NEON_JEV_MODEL";

    public static final String DEFAULT_ENDPOINT = "https://api.typesafe.ai/v1/systemone";
    public static final String DEFAULT_MODEL    = "jev-latest";

    /** Our key into the questions/answers maps. Any identifier works; it just has to match. */
    private static final String QUESTION_KEY = "selection";

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private final String strEndpoint;
    private final String strApiKey;
    private final String strModel;
    private final boolean bDebug;
    private final HttpClient client;

    public JevDecisionJudge(boolean bDebug) {
        this(System.getenv(ENV_ENDPOINT), System.getenv(ENV_API_KEY), System.getenv(ENV_MODEL), bDebug);
    }

    public JevDecisionJudge(String strEndpoint, String strApiKey, String strModel, boolean bDebug) {
        this.strEndpoint = (strEndpoint == null || strEndpoint.isEmpty()) ? DEFAULT_ENDPOINT : strEndpoint;
        this.strApiKey   = strApiKey;
        this.strModel    = (strModel == null || strModel.isEmpty()) ? DEFAULT_MODEL : strModel;
        this.bDebug      = bDebug;
        this.client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
    }

    @Override
    public String GetName() {
        return "jev";
    }

    /** Whether a key is present. Check before wiring this into a cascade. */
    public boolean IsConfigured() {
        return strApiKey != null && !strApiKey.isEmpty();
    }

    @Override
    public JudgeDecision Decide(String strInstructions,
                                List<String> labels,
                                Map<String, String> context) throws Exception {

        if (labels == null || labels.isEmpty()) {
            return JudgeDecision.None(GetName());
        }

        if (!IsConfigured()) {
            throw new IllegalStateException(
                "JevDecisionJudge is not configured: set " + ENV_API_KEY
                + ". Wrap this judge in a CascadingJudge if you want it to fall back instead of fail.");
        }

        String strBody = BuildRequestBody(strInstructions, labels, context);

        if (bDebug) {
            System.out.println("JevDecisionJudge: POST " + strEndpoint + " body [" + strBody + "]");
        }

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(strEndpoint))
            .timeout(Duration.ofSeconds(30))
            .header("Content-Type", "application/json")
            .header("Authorization", "Bearer " + strApiKey)
            .POST(HttpRequest.BodyPublishers.ofString(strBody))
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            throw new IllegalStateException("JevDecisionJudge: HTTP " + response.statusCode()
                + " from " + strEndpoint + ": " + response.body());
        }

        if (bDebug) {
            System.out.println("JevDecisionJudge: response [" + response.body() + "]");
        }

        return ParseResponse(response.body(), labels);
    }

    /** Builds the {@code POST /v1/systemone} body. */
    String BuildRequestBody(String strInstructions,
                                    List<String> labels,
                                    Map<String, String> context) throws Exception {
        ObjectNode root = MAPPER.createObjectNode();

        // state: the situation being judged. An object keeps the fields separable rather
        // than narrating them into one sentence, which is the point of a typed interface.
        ObjectNode state = root.putObject("state");
        if (context != null) {
            for (Map.Entry<String, String> e : context.entrySet()) {
                state.put(e.getKey(), e.getValue());
            }
        }

        root.put("model", strModel);

        ObjectNode question = root.putObject("questions").putObject(QUESTION_KEY);
        question.put("type", "choice");
        question.put("instructions", strInstructions);

        // criteria: option name -> description. Null descriptions are allowed and
        // appropriate here; the plan display names are already self-describing.
        ObjectNode criteria = question.putObject("criteria");
        for (String strLabel : labels) {
            criteria.putNull(strLabel);
        }

        return MAPPER.writeValueAsString(root);
    }

    /**
     * Reads {@code answers.selection}. Resolves the returned choice against our candidate
     * list by normalised name, falls back to the highest probability when no explicit
     * choice is present, and yields {@link JudgeDecision#None} rather than inventing an
     * answer when nothing usable came back.
     */
    JudgeDecision ParseResponse(String strBody, List<String> labels) throws Exception {
        JsonNode root = MAPPER.readTree(strBody);

        JsonNode answers = root.get("answers");
        JsonNode answer  = (answers == null) ? null : answers.get(QUESTION_KEY);

        if (answer == null) {
            if (bDebug) {
                System.out.println("JevDecisionJudge: no answers." + QUESTION_KEY + " in response");
            }
            return JudgeDecision.None(GetName());
        }

        // probabilities are returned as fractions; scale to integers for Normalise()
        Map<String, Integer> scores = new HashMap<String, Integer>();
        JsonNode probs = answer.get("probabilities");

        if (probs != null && probs.isObject()) {
            Iterator<String> it = probs.fieldNames();
            while (it.hasNext()) {
                String strField = it.next();
                double dValue = probs.get(strField).asDouble(0.0);
                scores.put(PlanUtils.NormaliseName(strField),
                           Integer.valueOf((int) Math.round(dValue * 10000.0)));
            }
        }

        Map<String, Double> probabilities = DecisionJudge.Normalise(labels, scores);

        String strChoice = (answer.get("choice") == null) ? null : answer.get("choice").asText(null);
        String strResolved = Resolve(strChoice, labels);

        if (strResolved == null) {
            double dBest = 0.0;
            for (Map.Entry<String, Double> e : probabilities.entrySet()) {
                if (e.getValue().doubleValue() > dBest) {
                    dBest = e.getValue().doubleValue();
                    strResolved = e.getKey();
                }
            }
        }

        if (strResolved == null) {
            return JudgeDecision.None(GetName());
        }

        // Jev reports its own confidence, derived from the distribution. Prefer it; fall
        // back to the winner's probability, and to 1.0 for a verdict with no distribution.
        double dConfidence;
        if (answer.get("confidence") != null) {
            dConfidence = answer.get("confidence").asDouble(0.0);
        } else {
            Double d = probabilities.get(strResolved);
            dConfidence = (d == null || d.doubleValue() == 0.0) ? 1.0 : d.doubleValue();
        }

        return new JudgeDecision(strResolved,
                                 new LinkedHashMap<String, Double>(probabilities),
                                 dConfidence,
                                 GetName());
    }

    /** Matches a returned option name against our candidates, ignoring case and spacing. */
    private static String Resolve(String strChoice, List<String> labels) {
        if (strChoice == null || strChoice.isEmpty()) return null;

        String strKey = PlanUtils.NormaliseName(strChoice);
        for (String strCandidate : labels) {
            if (PlanUtils.NormaliseName(strCandidate).equals(strKey)) {
                return strCandidate;
            }
        }
        return null;
    }
}
