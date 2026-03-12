/*******************************************************************
 * Created by the JDE: Thu Mar 12 13:02:29 EDT 2026
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

}
