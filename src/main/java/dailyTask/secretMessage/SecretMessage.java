package dailyTask.secretMessage;

public class SecretMessage {
    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return "Hello, %s!" + name;
    }
}
