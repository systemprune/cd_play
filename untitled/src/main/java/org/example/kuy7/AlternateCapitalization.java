package org.example.kuy7;

import java.util.stream.IntStream;

public class AlternateCapitalization {
    public static String[] capitalize(String s) {
        // Gorillaz - Do Ya Thing (2010)
        StringBuilder odd = new StringBuilder();
        StringBuilder noOdd = new StringBuilder();

        IntStream.range(0, s.length()).forEach(i -> {
            char currentChar = s.charAt(i);
            if (i % 2 == 0) {
                noOdd.append(Character.toUpperCase(currentChar));
                odd.append(Character.toLowerCase(currentChar));
            } else {
                noOdd.append(Character.toLowerCase(currentChar));
                odd.append(Character.toUpperCase(currentChar));
            }
        });

        return new String[]{noOdd.toString(), odd.toString()};
    }
}
