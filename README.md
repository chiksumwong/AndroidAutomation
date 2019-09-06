"# AndroidAutomation" 

Run UI Test:
$ gradlew <path of file> <lib>:connected<build variants>AndroidTest
e.g.
$ gradlew -Pandroid.testInstrumentationRunnerArguments.class=com.cs.androidautomation.TestSuite.MainTestSuite app:connecteddebugAndroidTest

Report path:
<path of project>/app/build/outputs/reports/androidTests/