package org.example.kuy8;

import java.util.stream.IntStream;

public class SumOfMultiples {
    public static long sumMul(int n, int m) {
        if (m <= n || n <= 0) {
            throw new IllegalArgumentException();
        }
        return IntStream
                .iterate(n, f -> f < m, f -> f + n)
                .sum();
    }
}
