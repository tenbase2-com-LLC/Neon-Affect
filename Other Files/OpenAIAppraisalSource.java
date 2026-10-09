package NeonAffect;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * Produces an appraisal vector by asking OpenAI to rate a described situation
 * on the 24 dimensions.
 *
 * <p><b>Structured output, not parsed prose.</b> The request carries a strict
 * JSON schema naming all 24 dimensions, all required, {@code additionalProperties}
 * false. That is the whole reason this is reliable: the alternative - asking for
 * numbers in prose and pulling them out afterwards - fails silently in the worst
 * possible way, because a vector with three dimensions missing or transposed
 * still produces a confident classification. The existing C# library has a
 * {@code TryExtractJson} fallback and a list of "labels the model likes to put
 * in front of the answer" for exactly this reason; with a strict schema none of
 * that is needed.</p>
 *
 * <p><b>Why {@code java.net.http} rather than the bundled library.</b>
 * {@code OpenAIClassLibrary.jar} already talks to OpenAI, and the right home for
 * this call is a {@code DetermineAppraisal} method alongside its existing five.
 * The jar ships without source - not on disk, not inside the jar - so that was
 * not available. {@code HttpClient} is in the JDK, adds no dependency, and keeps
 * the call behind {@link IAppraisalSource} so it can move into the jar later
 * without touching anything downstream. Jackson comes from that same jar, which
 * is already on the classpath.</p>
 *
 * <p><b>Configuration</b> (environment variables):</p>
 * <ul>
 *   <li>{@code OPENAI_API_KEY} - required</li>
 *   <li>{@code OPENAI_MODEL} - defaults to the {@code ChatModel} the project's
 *       own C# library uses, so both halves stay on one model by default</li>
 *   <li>{@code OPENAI_BASE_URL} - for a proxy or a local mock</li>
 * </ul>
 */
public class OpenAIAppraisalSource implements IAppraisalSource {

    /** Matches ChatModel in OpenAIClassLibrary/openai_5.cs. */
    private static final String DEFAULT_MODEL = "gpt-5.6-luna";
    private static final String DEFAULT_BASE_URL = "https://api.openai.com";

    private static final String SYSTEM_PROMPT =
        "You are an appraisal-theory rater. You are given a situation as "
        + "experienced by a person of a stated Myers-Briggs type, and you rate "
        + "it on 24 appraisal dimensions, each from 0.0 to 1.0.\n\n"
        + "Rate the situation AS THAT PERSON APPRAISES IT, not as a neutral "
        + "observer would. The same event is a challenge to one type and a "
        + "threat to another; that difference is what you are being asked for.\n\n"
        + "Use the full range. Appraisal dimensions that cluster near 0.5 carry "
        + "no information, and a vector of middling values cannot be told apart "
        + "from any other. If a dimension genuinely does not apply, rate it low "
        + "rather than neutral.\n\n"
        + "Several of these dimensions are easy to conflate and are not the "
        + "same: predictability is foresight before the event, certainty is "
        + "confidence about what is the case now, and expectedness is departure "
        + "from what was anticipated in the moment. Rate them independently.";

    private final boolean bDebug;
    private final String apiKey;
    private final String model;
    private final String baseUrl;
    private final HttpClient http;
    private final ObjectMapper mapper = new ObjectMapper();

    public OpenAIAppraisalSource(boolean bDebug) {
        this.bDebug = bDebug;
        this.apiKey = System.getenv("OPENAI_API_KEY");
        String m = System.getenv("OPENAI_MODEL");
        this.model = (m == null || m.isBlank()) ? DEFAULT_MODEL : m;
        String b = System.getenv("OPENAI_BASE_URL");
        this.baseUrl = (b == null || b.isBlank()) ? DEFAULT_BASE_URL : b;
        this.http = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(20))
            .build();
    }

    @Override
    public AffectAppraisal DetermineAppraisal(String situation,
                                              String personalityType)
        throws Exception {

        if (situation == null || situation.isBlank()) {
            throw new IllegalArgumentException("situation is empty");
        }
        if (personalityType == null || personalityType.isBlank()) {
            throw new IllegalArgumentException("personality type is empty");
        }
        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalStateException(
                "OPENAI_API_KEY is not set. Use ScriptedAppraisalSource for "
                + "offline runs rather than leaving this unset - an unset key "
                + "should stop the run, not silently degrade it.");
        }

        String body = mapper.writeValueAsString(buildRequest(situation, personalityType));

        if (bDebug) {
            System.out.println("OpenAIAppraisalSource: model [" + model + "]");
            System.out.println("OpenAIAppraisalSource: situation [" + situation + "]");
        }

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(baseUrl + "/v1/chat/completions"))
            .timeout(Duration.ofSeconds(120))
            .header("Content-Type", "application/json")
            .header("Authorization", "Bearer " + apiKey)
            .POST(HttpRequest.BodyPublishers.ofString(body))
            .build();

        HttpResponse<String> response =
            http.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() / 100 != 2) {
            throw new Exception("OpenAI returned HTTP " + response.statusCode()
                + ": " + truncate(response.body()));
        }

        JsonNode root = mapper.readTree(response.body());
        JsonNode choices = root.path("choices");
        if (!choices.isArray() || choices.isEmpty()) {
            throw new Exception("OpenAI response had no choices: "
                + truncate(response.body()));
        }

        JsonNode message = choices.get(0).path("message");
        // A refusal is a distinct field under structured outputs, and it comes
        // back with content null. Reporting it as a parse failure would send
        // whoever reads the log looking at the schema instead of the prompt.
        JsonNode refusal = message.path("refusal");
        if (!refusal.isNull() && !refusal.isMissingNode() && refusal.isTextual()) {
            throw new Exception("OpenAI refused the appraisal request: "
                + refusal.asText());
        }

        String content = message.path("content").asText(null);
        if (content == null || content.isBlank()) {
            throw new Exception("OpenAI returned no content: "
                + truncate(response.body()));
        }

        return parseAppraisal(content);
    }

    /** Reads the 24 dimensions out of the model's JSON object. */
    private AffectAppraisal parseAppraisal(String content) throws Exception {
        JsonNode obj = mapper.readTree(content);
        float[] v = new float[AppraisalDimensions.COUNT];
        for (int i = 0; i < AppraisalDimensions.COUNT; i++) {
            String name = AppraisalDimensions.JSON[i];
            JsonNode node = obj.path(name);
            // The schema marks every dimension required, so a miss here means
            // the schema and AppraisalDimensions have drifted apart. Say which
            // one is missing rather than defaulting it - a defaulted dimension
            // is exactly the silent-wrong-answer case.
            if (node.isMissingNode() || !node.isNumber()) {
                throw new Exception("appraisal dimension missing or non-numeric: "
                    + name + " in " + truncate(content));
            }
            v[i] = (float) node.asDouble();
        }
        if (bDebug) {
            System.out.println("OpenAIAppraisalSource: raw appraisal " + content);
        }
        return AppraisalDimensions.toAppraisal(v);
    }

    /** Chat-completions request with a strict JSON schema for the 24 dimensions. */
    private ObjectNode buildRequest(String situation, String personalityType) {
        ObjectNode properties = mapper.createObjectNode();
        ArrayNode required = mapper.createArrayNode();
        for (int i = 0; i < AppraisalDimensions.COUNT; i++) {
            ObjectNode dim = mapper.createObjectNode();
            dim.put("type", "number");
            dim.put("description", AppraisalDimensions.DESCRIPTION[i]);
            properties.set(AppraisalDimensions.JSON[i], dim);
            required.add(AppraisalDimensions.JSON[i]);
        }

        ObjectNode schema = mapper.createObjectNode();
        schema.put("type", "object");
        schema.set("properties", properties);
        schema.set("required", required);
        schema.put("additionalProperties", false);

        ObjectNode jsonSchema = mapper.createObjectNode();
        jsonSchema.put("name", "affect_appraisal");
        jsonSchema.put("strict", true);
        jsonSchema.set("schema", schema);

        ObjectNode responseFormat = mapper.createObjectNode();
        responseFormat.put("type", "json_schema");
        responseFormat.set("json_schema", jsonSchema);

        ObjectNode system = mapper.createObjectNode();
        system.put("role", "system");
        system.put("content", SYSTEM_PROMPT);

        ObjectNode user = mapper.createObjectNode();
        user.put("role", "user");
        user.put("content",
            "Myers-Briggs type: " + personalityType + "\n\n"
            + "Situation:\n" + situation);

        ArrayNode messages = mapper.createArrayNode();
        messages.add(system);
        messages.add(user);

        ObjectNode req = mapper.createObjectNode();
        req.put("model", model);
        req.set("messages", messages);
        req.set("response_format", responseFormat);
        return req;
    }

    private static String truncate(String s) {
        if (s == null) {
            return "null";
        }
        return s.length() <= 500 ? s : s.substring(0, 500) + "...";
    }
}
