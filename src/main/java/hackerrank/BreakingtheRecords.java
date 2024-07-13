package hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

 class BreakingtheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int max_count = 0;
        int min_count = 0;
        int max_score = scores.get(0);
        int min_score = scores.get(0);

        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score > max_score) {
                max_score = score;
                max_count++;
            }if (score < min_score) {
                min_score = score;
                min_count++;
            }
        }
        return Arrays.asList(max_count, min_count);
    }

}

 class Solutioner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = BreakingtheRecords.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );
        bufferedReader.close();
        bufferedWriter.close();
    }
}
