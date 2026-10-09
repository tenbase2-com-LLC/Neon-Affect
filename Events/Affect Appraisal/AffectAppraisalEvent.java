/*******************************************************************
 * Created by the JDE: Fri Oct 09 07:56:20 EDT 2026
 * WARNING: If you are editing this file from outside the JDE, you
 * should make sure to load the changes back into the JDE by setting
 * the preference "Check for outside changes..." in the "Text Editor"
 * preference tab or reload the component manually.
 * Otherwise you will lose your changes next time the file is generated.
 *******************************************************************/

package NeonAffect;


/**
 * 
 */
public event AffectAppraisalEvent extends Event {
    public int iAffectType = -1;
    public logical int $id;
    public logical float $self_responsibility;
    public logical float $other_responsibility;
    public logical float $circumstances_responsibility;
    public logical float $problem_focused_coping;
    public logical float $goal_relevance;
    public logical float $attentional_activity;
    public logical float $emotion_focused_coping;
    public logical float $self_controllable;
    public logical float $other_controllable;
    public logical float $circumstances_controllable;
    public logical float $predictability;
    public logical float $threat;
    public logical float $pleasantness;
    public logical float $certainty;
    public logical float $goal_conduciveness;
    public logical float $fairness;
    public logical float $future_expectancy;
    public logical float $consistency_with_social_norms;
    public logical float $loss;
    public logical float $familiarity;
    public logical float $effort;
    public logical float $challenge;
    public logical float $consistency_with_internal_values;
    public logical float $expectedness;
    public logical String $type;

    #uses data Appraisals appraisals;
    #uses data PersonalityType personalityType;

    #posted when (appraisals.get($id, $self_responsibility, $other_responsibility, $circumstances_responsibility, $problem_focused_coping, $goal_relevance, $attentional_activity, $emotion_focused_coping, $self_controllable, $other_controllable, $circumstances_controllable, $predictability, $threat, $pleasantness, $certainty, $goal_conduciveness, $fairness, $future_expectancy, $consistency_with_social_norms, $loss, $familiarity, $effort, $challenge, $consistency_with_internal_values, $expectedness) &&
                    personalityType.get(0, $type).next() && $type != null)
    {
        try
        {
            iAffectType = new AppraisalUtils().GetAppraisalType($self_responsibility.as_float(), $other_responsibility.as_float(), $circumstances_responsibility.as_float(), $problem_focused_coping.as_float(), $goal_relevance.as_float(), $attentional_activity.as_float(), $emotion_focused_coping.as_float(), $self_controllable.as_float(), $other_controllable.as_float(), $circumstances_controllable.as_float(), $predictability.as_float(), $threat.as_float(), $pleasantness.as_float(), $certainty.as_float(), $goal_conduciveness.as_float(), $fairness.as_float(), $future_expectancy.as_float(), $consistency_with_social_norms.as_float(), $loss.as_float(), $familiarity.as_float(), $effort.as_float(), $challenge.as_float(), $consistency_with_internal_values.as_float(), $expectedness.as_float(), $type.as_string());
        }
        catch (Exception e)
        {
            e.printStackTrace();   
        }
    
        System.out.println("NeonAffectAgent.AffectAppraisalEvent AffectType: [" + Integer.toString(iAffectType) + "]");
    }

}

