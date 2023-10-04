package LeetCode.convertToTitleExcel;

public class convertToTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            int reminder = (columnNumber - 1) % 26;
            char letter = (char) ('A' + reminder);
            result.insert(0, letter);
            columnNumber = (columnNumber - 1) / 26;
        }
        return result.toString();
    }
}
