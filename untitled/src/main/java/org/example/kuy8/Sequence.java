package org.example.kuy8;

import java.util.stream.IntStream;

public class Sequence {
    public static int[] reverse(int n) {
        return IntStream.rangeClosed(1, n)
                .map(i -> n - i + 1)
                .toArray();
    }
}
