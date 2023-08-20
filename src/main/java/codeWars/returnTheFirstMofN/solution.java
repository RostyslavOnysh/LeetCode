package codeWars.returnTheFirstMofN;

public class solution {
    public static int[] multiples(int m, int n) {
        int[] result = new int[m];
        for (int i = 0; i < result.length; i++) {
            result[i] = n * (i + 1);
        }
        return result;
    }
}