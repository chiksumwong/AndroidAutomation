package com.cs.androidautomation.Scenario.Calculation;

import com.cs.androidautomation.Scenario.TestCaseBase;

import org.junit.Before;
import org.junit.Test;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

public class Case_001_Calculation_Add extends TestCaseBase {
    @Before
    public void setUp(){
        instrumentation = getInstrumentation();
        getIntent();
    }

    @Test
    public void testCase1(){
        //your test code ....
    }
}
