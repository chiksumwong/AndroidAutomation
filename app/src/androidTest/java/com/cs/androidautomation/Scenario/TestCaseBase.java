package com.cs.androidautomation.Scenario;

import android.app.Instrumentation;
import android.content.Intent;

import androidx.test.rule.ActivityTestRule;
import androidx.test.uiautomator.UiDevice;

//app MainActivity
import com.cs.androidautomation.Function.Sleep;
import com.cs.androidautomation.ui.base.MainActivity;

import org.junit.Rule;
import org.junit.rules.Timeout;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static androidx.test.uiautomator.UiDevice.getInstance;
import static com.cs.androidautomation.Function.ViewMatchers.withIndex;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class TestCaseBase extends ActivityTestRule<MainActivity> {

    protected Instrumentation instrumentation = getInstrumentation();
    protected Instrumentation.ActivityMonitor monitor;
    protected Intent intent;

    protected MainActivity mainActivity;

    protected UiDevice device;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(2000 * 10);

    public TestCaseBase() {
        super(MainActivity.class);
    }

    public void getIntent() {
        intent = new Intent(instrumentation.getTargetContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mainActivity = (MainActivity) instrumentation.startActivitySync(intent);
    }

    public void setMonitor(){
        monitor = instrumentation.addMonitor(MainActivity.class.getName(), null, false);// MainActivity.class can be changed to other "Activity"
    }

//View
    public void checkViewSameTextWithIndex(int index, String expectedText){
        Sleep.shortSleep();
        onView(withIndex(withText(expectedText),index)).check(matches(isDisplayed()));
    }  //Start with 0
    public void clickViewSameTextWithIndex(int index, String text){
        Sleep.shortSleep();
        onView(withIndex(withText(startsWith(text)),index)).perform(click());
    }
    public void countRecyclerViewItem(int expectedCount){
//        onView(withId(R.id.recycler_view))// id of recycler view
//                .check(matches(hasChildCount(expectedCount)));
    }                    //Check the count of recycler view item, e.g. list of table
//Ui Device
    public void clickWithCoordinate(int x, int y){
        device = getInstance(instrumentation);
        device.click(x, y);
        Sleep.sleep();
    }

    //Back
    public static void back() {
        pressBack();
//        instrumentation.waitForIdleSync();
        Sleep.sleep();
    }
}
