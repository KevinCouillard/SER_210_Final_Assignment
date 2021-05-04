package edu.quinnipiac.ser210.ser_210_final_assignment;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places Main Activity Test
 * 4/29/21
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    //tests whole app only way to do it so dataSource is created
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void startApp() {
        //test intent to services activity
        onView(withId(R.id.startApp)).perform(click());

        //tests all the buttons have the correct text
        onView(withText("Gas Stations")).check(matches(isDisplayed()));
        onView(withText("Restaurants")).check(matches(isDisplayed()));
        onView(withText("Parks")).check(matches(isDisplayed()));

        //test intent to options activity
        onView(withId(R.id.gas_stations)).perform(click());

        //tests all the buttons have the correct text
        onView(withText("Hamden Ultra Sunoco")).check(matches(isDisplayed()));
        onView(withText("7-Eleven")).check(matches(isDisplayed()));
        onView(withText("Cumberland Farms")).check(matches(isDisplayed()));
        onView(withText("Shea's Service Center")).check(matches(isDisplayed()));

        //"tests" navigation to info fragment
        onView(withId(R.id.option_4)).perform(click());

        //tests text view is displaying correct text
        onView(withText("Name: Shea's Service Center" + "\n" + "\n" +
                "Location: 1182 Whitney Ave" + "\n" + "\n" +
                "Timing: 7:00 AM - 5:30 PM Mon-Fri, 7:00 AM - 12:00 AM Sat" + "\n" + "\n" +
                "Gas Type: 87 octane regular, 89 octane plus, 91 octane premium" + "\n" + "\n" +
                "Rating: 5.0")).check(matches(isDisplayed()));
    }
}