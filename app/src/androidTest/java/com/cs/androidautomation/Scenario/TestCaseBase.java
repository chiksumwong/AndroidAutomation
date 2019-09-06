package com.cs.androidautomation.Scenario;

import android.app.Instrumentation;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

//app MainActivity
import com.cs.androidautomation.MainActivity;

import org.junit.Rule;
import org.junit.rules.Timeout;

public class TestCaseBase extends ActivityTestRule<MainActivity> {

    protected Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
    protected Instrumentation.ActivityMonitor monitor;
    protected Intent intent;

    protected MainActivity mainActivity;

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
}
