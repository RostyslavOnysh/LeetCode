package hackerrank.strings;

import java.util.regex.Pattern;

public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        Pattern digitPattern = Pattern.compile("[0-9]");
        Pattern lowerCasePattern = Pattern.compile("[a-z]");
        Pattern upperCasePattern = Pattern.compile("[A-Z]");
        Pattern specialCharPattern = Pattern.compile("[!@#$%^&*()\\-+]");

        boolean hasDigit = digitPattern.matcher(password).find();
        boolean hasLower = lowerCasePattern.matcher(password).find();
        boolean hasUpper = upperCasePattern.matcher(password).find();
        boolean hasSpecial = specialCharPattern.matcher(password).find();
        int missingTypes = 0;

        if (!hasDigit) missingTypes++;
        if (!hasLower) missingTypes++;
        if (!hasUpper) missingTypes++;
        if (!hasSpecial) missingTypes++;

        int lengthDeficit = Math.max(0, 6 - n);

        return Math.max(missingTypes, lengthDeficit);
    }
}
