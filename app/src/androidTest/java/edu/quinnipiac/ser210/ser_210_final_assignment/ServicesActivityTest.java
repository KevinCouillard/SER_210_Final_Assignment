package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.content.Intent;

import androidx.annotation.ContentView;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class ServicesActivityTest {

    @Rule
    public ActivityTestRule<ServicesActivity> servicesActivityTestRule = new ActivityTestRule<>(ServicesActivity.class);
    @Test
    public void start_options() {
        //onView(withId(R.id.gas_stations)).perform(click());
        Intent intent = new Intent();
        intent.putExtra("placeTypeSelected",0);

        servicesActivityTestRule.launchActivity(intent);

        servicesActivityTestRule.getActivity().getIntent().getExtras().get("placeTypeSelected").equals(0);
    }
}