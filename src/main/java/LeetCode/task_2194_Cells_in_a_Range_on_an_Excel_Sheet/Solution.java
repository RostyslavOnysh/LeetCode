package LeetCode.task_2194_Cells_in_a_Range_on_an_Excel_Sheet;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> cellsInRange(String s) {
        char c1 = s.charAt(0), c2 = s.charAt(3);
        char r1 = s.charAt(1), r2 = s.charAt(4);
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();

        for (char i = c1; i <= c2; i++) {
            for (char j = r1; j <= r2; j++) {
                sb.append(i).append(j);
                result.add(sb.toString());
                sb.setLength(0);
            }
        }
        return result;
    }
}

/*
class Solution {
    public List<String> cellsInRange(String s) {
        int sepIndex = s.indexOf(':');

        String start = s.substring(0, sepIndex);
        String end = s.substring(sepIndex + 1);

        int startRow = extractRow(start);
        int endRow = extractRow(end);

        String startCol = extractColumn(start);
        String endCol = extractColumn(end);

        int startColNum = convertColumnToNumber(startCol);
        int endColNum = convertColumnToNumber(endCol);

        List<String> result = new ArrayList<>();
        StringBuilder cellAddress = new StringBuilder();

        for (int col = startColNum; col <= endColNum; col++) {
            for (int row = startRow; row <= endRow; row++) {
                cellAddress.setLength(0);
                cellAddress.append(convertNumberToColumn(col)).append(row);
                result.add(cellAddress.toString());
            }
        }
        return result;
    }

    private String extractColumn(String cell) {
        int i = 0;
        while (i < cell.length() && Character.isLetter(cell.charAt(i))) {
            i++;
        }
        return cell.substring(0, i);
    }

    private int extractRow(String cell) {
        int i = 0;
        while (i < cell.length() && Character.isLetter(cell.charAt(i))) {
            i++;
        }
        return Integer.parseInt(cell.substring(i));
    }

    private int convertColumnToNumber(String column) {
        int number = 0;
        for (int i = 0; i < column.length(); i++) {
            number = number * 26 + (column.charAt(i) - 'A' + 1);
        }
        return number;
    }

    private String convertNumberToColumn(int number) {
        StringBuilder column = new StringBuilder();
        while (number > 0) {
            int remainder = (number - 1) % 26;
            column.insert(0, (char) (remainder + 'A'));
            number = (number - 1) / 26;
        }
        return column.toString();
    }
}
 */