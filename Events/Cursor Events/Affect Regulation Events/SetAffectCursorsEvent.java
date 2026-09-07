/*******************************************************************
 * Created by the JDE: Mon Sep 07 11:06:52 EDT 2026
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
public event SetAffectCursorsEvent extends Event {
    public int iCursorNumber = 0;

    #posted as
    post(int iCursorNumber1)
    {
        iCursorNumber = iCursorNumber1;   
    }


}
