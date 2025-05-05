package org.example.kuy7;

import java.util.List;
import java.util.stream.IntStream;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        if (lines.size() == 0) return lines;

        return IntStream.range(0,lines.size())
                .mapToObj(i -> i + 1 + ": " + lines.get(i))
                .toList();
    }
}
