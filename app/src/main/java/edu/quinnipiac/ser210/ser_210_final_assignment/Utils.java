package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.app.Activity;
import android.content.Intent;
public class Utils
{

    private static int sTheme = 6;
    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }
    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            case 0:
                activity.setTheme(R.style.FirstTheme);
                break;
            case 1:
                activity.setTheme(R.style.SecondTheme);
                break;
            case 2:
                activity.setTheme(R.style.ThirdTheme);
                break;
            case 3:
                activity.setTheme(R.style.FourthTheme);
                break;
            case 4:
                activity.setTheme(R.style.FifthTheme);
                break;
            case 5:
                activity.setTheme(R.style.SixthTheme);
                break;
            default:
        }
    }
}
