package org.example.kuy6;

import java.util.stream.IntStream;

public class MexicanWave {
    public static String[] wave(String str) {
        // Your code here
        return IntStream.range(0, str.length())
                .mapToObj(w -> new StringBuilder(str).replace(w, w + 1, String.valueOf(str.charAt(w)).toUpperCase()).toString())
                .filter(c -> !c.equals(str))
                .toArray(String[]::new);
    }
}
