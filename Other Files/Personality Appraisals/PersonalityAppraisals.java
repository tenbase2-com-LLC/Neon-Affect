
package NeonAffect;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PersonalityAppraisals {

    private final Map<String, List<AffectAppraisal>> map = new HashMap<>();

    public PersonalityAppraisals() {
        map.put("ENFJ", new ENFJ_PersonalityTypeAppraisals().getAppraisals());
        map.put("ENFP", new ENFP_PersonalityTypeAppraisals().getAppraisals());
        map.put("ENTJ", new ENTJ_PersonalityTypeAppraisals().getAppraisals());
        map.put("ENTP", new ENTP_PersonalityTypeAppraisals().getAppraisals());
        map.put("ESFJ", new ESFJ_PersonalityTypeAppraisals().getAppraisals());
        map.put("ESFP", new ESFP_PersonalityTypeAppraisals().getAppraisals());
        map.put("ESTJ", new ESTJ_PersonalityTypeAppraisals().getAppraisals());
        map.put("ESTP", new ESTP_PersonalityTypeAppraisals().getAppraisals());
        map.put("INFJ", new INFJ_PersonalityTypeAppraisals().getAppraisals());
        map.put("INFP", new INFP_PersonalityTypeAppraisals().getAppraisals());
        map.put("INTJ", new INTJ_PersonalityTypeAppraisals().getAppraisals());
        map.put("INTP", new INTP_PersonalityTypeAppraisals().getAppraisals());
        map.put("ISFJ", new ISFJ_PersonalityTypeAppraisals().getAppraisals());
        map.put("ISFP", new ISFP_PersonalityTypeAppraisals().getAppraisals());
        map.put("ISTJ", new ISTJ_PersonalityTypeAppraisals().getAppraisals());
        map.put("ISTP", new ISTP_PersonalityTypeAppraisals().getAppraisals());
    }

    public List<AffectAppraisal> get(String personalityType) {
        return map.get(personalityType);
    }
}
