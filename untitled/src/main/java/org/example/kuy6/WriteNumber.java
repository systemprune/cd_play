package org.example.kuy6;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WriteNumber {
    public static String expandedForm(int num) {
        String line = String.valueOf(num);
        return IntStream.range(0, line.length())
                .filter(i -> line.charAt(i) != '0')
                .mapToObj(i ->
                   line.charAt(i) + "0".repeat(line.length() - (i + 1))
                )
                .collect(Collectors.joining(" + "));
    }
}
