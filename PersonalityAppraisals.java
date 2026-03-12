
package NeonAffect;

import java.util.*;

class PersonalityAppraisals extends Hashtable {

    public PersonalityAppraisals()
    {
        super();
        
        put("ENFJ", (Object)new ENFJ_PersonalityTypeAppraisals());
        put("ENFP", (Object)new ENFP_PersonalityTypeAppraisals());
        put("ENTJ", (Object)new ENTJ_PersonalityTypeAppraisals());
        put("ENTP", (Object)new ENTP_PersonalityTypeAppraisals());
        put("ESFJ", (Object)new ESFJ_PersonalityTypeAppraisals());       
        put("ESFP", (Object)new ESFP_PersonalityTypeAppraisals());        
        put("ESTJ", (Object)new ESTJ_PersonalityTypeAppraisals());
        put("ESTP", (Object)new ESTP_PersonalityTypeAppraisals());
        put("INFJ", (Object)new INFJ_PersonalityTypeAppraisals());
        put("INFP", (Object)new INFP_PersonalityTypeAppraisals());
        put("INTJ", (Object)new INTJ_PersonalityTypeAppraisals());
        put("INTP", (Object)new INTP_PersonalityTypeAppraisals());
        put("ISFJ", (Object)new ISFJ_PersonalityTypeAppraisals());
        put("ISFP", (Object)new ISFP_PersonalityTypeAppraisals());
        put("ISTJ", (Object)new ISTJ_PersonalityTypeAppraisals());
        put("ISTP", (Object)new ISTP_PersonalityTypeAppraisals());        
    }
}
