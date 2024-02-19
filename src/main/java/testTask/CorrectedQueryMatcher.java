package testTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CorrectedQueryMatcher {
    public static void main(String[] args) throws IOException {
        // Отримати назву вхідного та вихідного файлів
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву вхідного файлу: ");
        String inputFileName = scanner.nextLine();
        System.out.print("Введіть назву вихідного файлу: ");
        String outputFileName = scanner.nextLine();

        // Зчитати дані з вхідного файлу
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        String line = reader.readLine(); // Перший рядок містить n і q
        if (line == null) {
            throw new IOException("Файл input.txt порожній!");
        }
        String[] parts = line.split(" ");
        int n = Integer.parseInt(parts[0]);
        int q = Integer.parseInt(parts[1]);
        String s = reader.readLine(); // Другий рядок містить рядок S

        // Створити вихідний файл
        PrintWriter writer = new PrintWriter(new FileWriter(outputFileName));

        // Виконати розрахунки для кожного запиту
        for (int i = 0; i < q; i++) {
            line = reader.readLine(); // Рядок запиту
            parts = line.split(" ");
            int l = Integer.parseInt(parts[0]);
            int r = Integer.parseInt(parts[1]);
            int k = Integer.parseInt(parts[2]);

            int pos = findMatch(s, l, r, k);
            writer.println(pos);
        }

        // Закрити файли
        reader.close();
        writer.close();

        System.out.println("Результати успішно записані до файлу " + outputFileName);
    }


    private static int findMatch(String s, int l, int r, int k) {
        String substring = s.substring(l - 1, r);
        char kthChar = substring.charAt(k - 1);

        int occurrences = 0;
        int pos = -1;

        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) == kthChar) {
                occurrences++;
                if (occurrences == k) {
                    if (kthChar == 'A') {
                        for (int j = i + 1; j < substring.length(); j++) {
                            if (substring.charAt(j) == 'B') {
                                pos = j + l;
                                break;
                            }
                        }
                        if (pos == -1) {
                            return -1;
                        }
                    } else {
                        pos = i + l;
                    }
                    break;
                }
            }
        }

        return pos;
    }
}