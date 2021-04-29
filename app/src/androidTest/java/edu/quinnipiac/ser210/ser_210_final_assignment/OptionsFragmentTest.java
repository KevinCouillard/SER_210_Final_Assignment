package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.view.View;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.navigation.Navigation;
import androidx.navigation.testing.TestNavHostController;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class OptionsFragmentTest {

    @Test
    public void onClick() {
        TestNavHostController navController = new TestNavHostController(
                ApplicationProvider.getApplicationContext());

        FragmentScenario<OptionsFragment> optionsFragmentFragmentScenario = FragmentScenario.launchInContainer(OptionsFragment.class);
        navController.setGraph(R.navigation.nav_map);


        optionsFragmentFragmentScenario.onFragment(fragment ->
        // Make the NavController available via the findNavController() APIs
        Navigation.setViewNavController(fragment.requireView(), navController)
        );

        //onView(withId(R.id.option_1)).perform(click());

        //This is the line from the developers page (The currentDestination method is giving error)
        //assertThat(navController.currentDestination.id).isEqualTo(R.id.info_frag);

       // assertThat(navController.getCurrentDestination().getId(),matches(View.info_frag));
        //onView(withId(R.id.info_frag)).check(matches(isDisplayed()));
    }
}