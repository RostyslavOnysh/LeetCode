package codeWars;

public class RemoveExclamationMarks {
        static String removeExclamationMarks(String s) {
            String delete = s.replaceAll(" ", "!");
            return delete;
        }
    }

