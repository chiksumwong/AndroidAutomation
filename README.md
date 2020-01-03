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

## Project Structure
- "Contract Class" which defines the connection between "View" and "Presenter"
- "Activity" which creates "Fragments" and "Presenters"
- "Fragment" which implements the "View Interface" 
- "Presenter" which implement the "Presenter Interface"
> "Presenter" hosts "business logic" with feature, and "View" handles the "UI" work.
> "View" contains no logic; it converts the "Presenter 's commands" to "UI actions".
> "View" listens for user actions, which are then passed to the presenter.

Todo:
- Tasks - Used to manage a list of tasks.
- TaskDetail - Used to read or delete a task.
- AddEditTask - Used to create or edit tasks.
- Statistics - Displays statistics related to tasks.


## Structure - MVVM
- data binding "State Data" (VM) and "Screen State" (View)

## Asynchronous
- "Asynchronous" can be handled by "Callbacks" and "RXJava"
- Callbacks (to handle asynchronous tasks)

## Function
- Toast
- Intent

## Store
- SharedPreferences (global variable)
- Room (data store in local SQLite database)

## Layout
- Tool Bar
- Drawer Layout (there have a icon in left side. click it then the drawer layout will show.)
- Fragment