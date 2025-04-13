package org.example.kuy7;

import java.util.Arrays;

public class LargestPairSum {
    public static int largestPairSum(int[] numbers) {
        // your code here
        Arrays.sort(numbers);
        int end = numbers.length;
        return numbers[end - 1] + numbers[end - 2];
    }
}
