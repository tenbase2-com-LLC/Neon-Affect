package NeonAffect;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Keeps data/cojack_cognitive.xml in step with the behaviour plans the affect
 * capabilities create from the BehaviorPlan template, so that adding a
 * behaviour is adding ONE line to a capability:
 *
 * <pre>
 *     #uses BehaviorPlan&lt;AffectEnum.RAGE, AffectEnum.VERBAL&gt; ScreamPlan;
 * </pre>
 *
 * For each such line the plan gets, in each of its affect's three parameter
 * groups (NeonRageVerbal, NeonRageNonverbal, NeonRageAction):
 * <ul>
 * <li>a param  PLAN_VALUE  value 20 in the channel named on the line, 0 in the other two;</li>
 * <li>an applies_to in the group's moderator (RageVerbal, ...): the active
 *     formula in its channel, "0" in the other two.</li>
 * </ul>
 *
 * The file is EDITED, not rewritten: only those two kinds of line, for the
 * template plans, are corrected or added. Everything else in the file - other
 * params, reservoir moderators, comments, other groups - is left as it is,
 * nothing is ever removed, and an existing active formula is kept (so tuned
 * formulas survive). An active formula with unbalanced parentheses is replaced
 * by the default and reported.
 *
 * Every plan is declared in all three groups, 0 where it is not active, because
 * CoJACK can change a declared moderator's formula at run time (the Jev API,
 * SetCognitiveFormula) but cannot add one.
 *
 * build.bat runs this after compiling. Run by hand:
 * <pre>java -cp . NeonAffect.BehaviorConfig [--check]</pre>
 * --check reports what would change without writing.
 */
public final class BehaviorConfig {
    private BehaviorConfig() {
    }

    public static final String DEFAULT_ACTIVE_FORMULA = "0.1 + random(19.9)";

    private static final String CAPABILITIES = "NeonAffect";
    private static final String XML = "data/cojack_cognitive.xml";
    private static final String[] CHANNELS = {AffectEnum.VERBAL, AffectEnum.NONVERBAL, AffectEnum.ACTION};

    private static final Pattern LINE = Pattern.compile(
        "#uses\\s+BehaviorPlan\\s*<\\s*AffectEnum\\.(\\w+)\\s*,\\s*AffectEnum\\.(\\w+)\\s*>\\s+(\\w+)\\s*;");

    /** One template line. */
    private static final class Behavior {
        final String capability;
        final String plan;
        final String affectName;
        final String channel;

        Behavior(String capability, String plan, String affectName, String channel) {
            this.capability = capability;
            this.plan = plan;
            this.affectName = affectName;
            this.channel = channel;
        }
    }

    private static int changes;
    private static final List<String> report = new ArrayList<String>();
    private static final List<String> problems = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        boolean check = args.length > 0 && args[0].equals("--check");
        List<Behavior> all = behaviors();
        String xml = new String(Files.readAllBytes(Paths.get(XML)), StandardCharsets.UTF_8);
        String out = xml;
        for (Behavior b : all) {
            for (String channel : CHANNELS) {
                out = apply(out, b, channel);
            }
        }
        if (!problems.isEmpty()) {
            for (String p : problems) {
                System.out.println("  PROBLEM " + p);
            }
            System.out.println("BehaviorConfig: " + problems.size() + " problem(s); " + XML + " NOT written");
            System.exit(1);
        }
        for (String r : report) {
            System.out.println("  " + r);
        }
        if (changes > 0 && !check) {
            Files.write(Paths.get(XML), out.getBytes(StandardCharsets.UTF_8));
        }
        System.out.println("BehaviorConfig: " + all.size() + " behaviour plans, " + changes + " change(s)"
            + (changes == 0 ? "" : check ? " (--check: not written)" : " written to " + XML));
    }

    private static List<Behavior> behaviors() throws Exception {
        List<Behavior> out = new ArrayList<Behavior>();
        try (DirectoryStream<Path> caps = Files.newDirectoryStream(Paths.get(CAPABILITIES), "*.cap")) {
            for (Path p : caps) {
                String src = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
                Matcher m = LINE.matcher(src);
                while (m.find()) {
                    String cap = p.getFileName().toString().replace(".cap", "");
                    int affect = AffectEnum.class.getField(m.group(1)).getInt(null);
                    Object channel = AffectEnum.class.getField(m.group(2)).get(null);
                    out.add(new Behavior(cap, m.group(3), AffectEnum.GetName(affect), (String) channel));
                }
            }
        }
        return out;
    }

    /** Correct or add plan b's two lines in the group of one channel. */
    private static String apply(String xml, Behavior b, String channel) {
        String group = "Neon" + b.affectName + channel;
        int gs = xml.indexOf("<parameter_group name=\"" + group + "\">");
        if (gs < 0) {
            problems.add(b.capability + "/" + b.plan + ": no parameter group " + group);
            return xml;
        }
        int ge = xml.indexOf("</parameter_group>", gs);
        boolean active = b.channel.equals(channel);
        String block = xml.substring(gs, ge);

        // the PLAN_VALUE param
        String wantValue = active ? "20" : "0";
        Matcher pm = live(Pattern.compile("<param name=\"PLAN_VALUE\" value=\"([^\"]*)\" attribute=\"" + b.plan + "\"/>"), block);
        if (pm != null) {
            if (!pm.group(1).equals(wantValue)) {
                block = block.substring(0, pm.start(1)) + wantValue + block.substring(pm.end(1));
                note(group, b.plan, "param " + pm.group(1) + " -> " + wantValue);
            }
        } else {
            int at = endOfLastLine(block, "<param name=\"PLAN_VALUE\"");
            if (at < 0) {
                at = startOfLine(block, block.indexOf("<moderator"));
            }
            block = block.substring(0, at) + "            <param name=\"PLAN_VALUE\" value=\"" + wantValue
                + "\" attribute=\"" + b.plan + "\"/>\n" + block.substring(at);
            note(group, b.plan, "param added (" + wantValue + ")");
        }

        // the applies_to in the group's moderator
        String type = b.affectName + channel;
        int ms = block.indexOf("<moderator type=\"" + type + "\"");
        if (ms < 0) {
            problems.add(b.capability + "/" + b.plan + ": group " + group + " has no moderator " + type);
            return xml;
        }
        int me = block.indexOf("</moderator>", ms);
        String mod = block.substring(ms, me);
        Matcher am = live(Pattern.compile("<applies_to attribute=\"" + b.plan + "\" name=\"PLAN_VALUE\" formula=\"([^\"]*)\"/>"), mod);
        if (am != null) {
            String has = am.group(1).trim();
            String want;
            if (!active) {
                want = "0";
            } else if (has.equals("0")) {
                want = DEFAULT_ACTIVE_FORMULA;
            } else if (!balanced(has)) {
                want = DEFAULT_ACTIVE_FORMULA;
                note(group, b.plan, "formula '" + has + "' has unbalanced parentheses");
            } else {
                want = am.group(1);
            }
            if (!want.equals(am.group(1))) {
                mod = mod.substring(0, am.start(1)) + want + mod.substring(am.end(1));
                note(group, b.plan, "formula '" + am.group(1) + "' -> '" + want + "'");
            }
        } else {
            String want = active ? DEFAULT_ACTIVE_FORMULA : "0";
            mod = mod + "    <applies_to attribute=\"" + b.plan + "\" name=\"PLAN_VALUE\" formula=\"" + want + "\"/>\n            ";
            note(group, b.plan, "formula added ('" + want + "')");
        }
        block = block.substring(0, ms) + mod + block.substring(me);
        return xml.substring(0, gs) + block + xml.substring(ge);
    }

    /** The first match that is not inside an XML comment, or null. */
    private static Matcher live(Pattern p, String text) {
        Matcher m = p.matcher(text);
        while (m.find()) {
            int open = text.lastIndexOf("<!--", m.start());
            int close = text.lastIndexOf("-->", m.start());
            if (open < 0 || close > open) {
                return m;
            }
        }
        return null;
    }

    private static int endOfLastLine(String text, String marker) {
        int i = text.lastIndexOf(marker);
        if (i < 0) {
            return -1;
        }
        int nl = text.indexOf('\n', i);
        return nl < 0 ? text.length() : nl + 1;
    }

    private static int startOfLine(String text, int i) {
        return text.lastIndexOf('\n', i) + 1;
    }

    private static boolean balanced(String f) {
        int depth = 0;
        for (char c : f.toCharArray()) {
            if (c == '(') {
                depth++;
            } else if (c == ')') {
                depth--;
            }
            if (depth < 0) {
                return false;
            }
        }
        return depth == 0;
    }

    private static void note(String group, String plan, String what) {
        changes++;
        report.add(group + " " + plan + ": " + what);
    }
}
