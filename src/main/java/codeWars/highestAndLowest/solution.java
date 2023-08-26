package codeWars.highestAndLowest;

public class solution {
    public static String highAndLow(String numbers) {
        String[] numStrings = numbers.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String numString : numStrings) {
            int num = Integer.parseInt(numString);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max + " " + min;
    }
}


/*
int[] intArray = Arrays.stream(numbers.split(" "))
                               .mapToInt(Integer::parseInt)
                               .toArray();

        int max = Arrays.stream(intArray).max().getAsInt();
        int min = Arrays.stream(intArray).min().getAsInt();

        return max + " " + min;
    }

 */