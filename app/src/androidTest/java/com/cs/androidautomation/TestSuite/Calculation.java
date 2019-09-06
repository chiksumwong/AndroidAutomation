package com.cs.androidautomation.TestSuite;

import com.cs.androidautomation.Scenario.Calculation.Case_001_Calculation_Add;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Case_001_Calculation_Add.class,
})

public class Calculation {
}
