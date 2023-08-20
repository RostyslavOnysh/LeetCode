package codeWars.needleInHayStack;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class solution {
    public static String findNeedle(Object[] haystack) {
        OptionalInt value = IntStream.range(0, haystack.length)
                .filter(i -> "needle".equals(haystack[i]))
                .findFirst();

        return value.isPresent() ? "found the needle at position" + value.getAsInt() : "needle not found";
    }
}

