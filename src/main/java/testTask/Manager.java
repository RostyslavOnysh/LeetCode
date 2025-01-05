package testTask;

public class Manager {
    public static void main(String[] args) {
        String s = "2235. Add Two Integers";
        System.out.println("task_" + result(s));
    }


    private static String result(String s) {
       return s.replace(" ", "_");
    }
}