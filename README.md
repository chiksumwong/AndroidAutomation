# AndroidAutomation

Run UI Test:
$ gradlew <path of file> <lib>:connected<build variants>AndroidTest
e.g.
$ gradlew -Pandroid.testInstrumentationRunnerArguments.class=com.cs.androidautomation.TestSuite.MainTestSuite app:connecteddebugAndroidTest

Report path:
<path of project>/app/build/outputs/reports/androidTests/

## Structure - MVP
- "Package of App" should have according to "features"
- "View" contains no logic
- "Presenter" is middleware between "View" and "Model"

## Structure - MVVM
- data binding "State Data" (VM) and "Screen State" (View)

## Asynchronous
- "Asynchronous" can be handled by "Callbacks" and "RXJava"

## Function
- Intent
- SharedPreferences
- Toast
- Room (data store in local SQLite database)
- Callbacks (to handle asynchronous tasks)