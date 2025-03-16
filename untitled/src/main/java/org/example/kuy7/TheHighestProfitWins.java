package org.example.kuy7;

import java.util.Arrays;

public class TheHighestProfitWins {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
        int[] result = new int[2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j > max) {
                max = j;
            }

            if (j < min) {
                min = j;
            }
        }

        result[0] = min;
        result[1] = max;

        return result;
        }
}
