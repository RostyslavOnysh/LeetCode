package dailyTask.funcInterface.task2;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return a DataContainer instances for Strings
    static public DataContainer<String> createStringDataContainer() {
        // Alter this Solution.md to return a DataContainer with String for the parameterized type
        // Give it the value "Hello"
        return new DataContainer<>("Hello");
    }

}