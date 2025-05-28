package org.example.kuy7;

import java.util.stream.IntStream;

public class SumOfTriangular {
    public static int sumTriangularNumbers(int n) {
        if (n <= 0) return 0;

        //    return n*(n+1)*(n+2)/6; interesting
        return IntStream.rangeClosed(1, n)
                .map(i -> i * (i + 1) / 2)
                .sum();
    }
}
