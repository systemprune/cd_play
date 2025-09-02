package org.example.kuy7;

import java.util.Arrays;
import java.util.Collections;

public class MaximumTripletSum {
    public static int maxTriSum(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .distinct()
                .limit(3)
                .mapToInt(i -> i)
                .sum();// Do your magic!
    }
}
