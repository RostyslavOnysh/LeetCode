package testTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        // Read first line: n q
        String line = reader.readLine();
        String[] parts = line.split(" ");
        int n = Integer.parseInt(parts[0]);
        int q = Integer.parseInt(parts[1]);

        // Read string S
        String S = reader.readLine();

        // Count occurrences of A and B
        int[] charCount = new int[2]; // 0 - count of 'A', 1 - count of 'B'
        for (char c : S.toCharArray()) {
            charCount[c == 'A' ? 0 : 1]++;
        }

        // Process each query
        for (int i = 0; i < q; i++) {
            line = reader.readLine();
            parts = line.split(" ");
            int l = Integer.parseInt(parts[0]) - 1; // Adjust for 0-based indexing
            int r = Integer.parseInt(parts[1]) - 1;
            int k = Integer.parseInt(parts[2]) - 1;

            // Count A characters before and after the substring
            int leftA = (l > 0 ? charCount[0] - charCount[S.charAt(l - 1) == 'A' ? 0 : 1] : 0);
            int rightA = charCount[0] - charCount[S.charAt(r) == 'A' ? 0 : 1];

            int targetPos = 0;
            if (S.charAt(k) == 'A') {
                targetPos = charCount[1] - rightA + k;
            } else {
                targetPos = charCount[0] - leftA + k;
            }

            // Check for valid position and write output
            writer.write(targetPos > 0 && targetPos <= n ? String.valueOf(targetPos) : "-1");
            writer.newLine();
        }

        reader.close();
        writer.close();
    }
}