package org.example.kuy7;

import java.util.Arrays;

public class SumTwoSmallestNumbers {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        //Your solution here
        return Arrays.stream(numbers)
                .filter(i -> i >= 0)
                .sorted()
                .limit(2)
                .sum();
    }
}
