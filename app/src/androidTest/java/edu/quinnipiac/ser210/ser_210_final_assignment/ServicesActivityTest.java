package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.content.ComponentName;
import android.content.Intent;

import androidx.annotation.ContentView;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.ComponentNameMatchers.hasShortClassName;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places Services Activity Test
 * 4/29/21
 */
@RunWith(AndroidJUnit4.class)
public class ServicesActivityTest {

    @Rule
    public ActivityTestRule<ServicesActivity> servicesActivityTestRule = new ActivityTestRule<>(ServicesActivity.class);

    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }
    @Test
    public void start_options() {
        onView(withId(R.id.gas_stations)).perform(click());
       // Intent intent = new Intent();
       // intent.putExtra("placeTypeSelected",0);
       // servicesActivityTestRule.launchActivity(intent);
      //  intended(hasComponent(new ComponentName(getTargetContext(),OptionsActivity.class)));

        intended(allOf(
                hasComponent(hasShortClassName(".OptionsActivity")),
                toPackage("edu.quinnipiac.ser210.ser_210_final_assignment"),
                hasExtra("placeTypeHolder", 0)));
        //onView(withId(R.id.option_1)).check(matches(withText("Hamden Ultra Sunoco")));
        //servicesActivityTestRule.getActivity().getIntent().getExtras().get("placeTypeSelected").equals(0);
    }
}