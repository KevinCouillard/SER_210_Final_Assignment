package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.content.Context;
import android.content.Intent;

import androidx.test.core.app.ActivityScenario;

        import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;


import org.junit.Rule;
import org.junit.Test;

        import org.junit.runner.RunWith;



        import static androidx.test.espresso.Espresso.onView;

        import static androidx.test.espresso.action.ViewActions.click;

        import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;

        import static androidx.test.espresso.action.ViewActions.typeText;

        import static androidx.test.espresso.assertion.ViewAssertions.matches;

        import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

        import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)

public class OptionsFragmentTest {

    @Rule
    public ActivityTestRule<OptionsActivity> oActivityRule =
            new ActivityTestRule<OptionsActivity>(OptionsActivity.class) {
                @Override
                protected Intent getActivityIntent() {
                    Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
                    Intent result = new Intent(targetContext, OptionsActivity.class);
                    result.putExtra("placeTypeSelected", 0);
                    return result;
                }
            };

    @Test

    public void UITest() {

        ActivityScenario<MainActivity> activityScenario = ActivityScenario.launch(MainActivity.class);
        ActivityScenario<OptionsActivity> activityScenario2 = ActivityScenario.launch(OptionsActivity.class);



        //Click on button

        onView(withId(R.id.option_1)).perform(click());



        //Check that the destination fragment being displayed is

        onView(withId(R.id.info_frag)).check(matches(isDisplayed()));

        //onView(withId(R.id.info_text)).check(matches(isDisplayed()));



            }

    }