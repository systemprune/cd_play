package org.example.kuy7;

import java.util.Arrays;

public class SumOfMinimums {
    public static int sumOfMinimums(int[][] arr){
        return Arrays.stream(arr)
                .mapToInt(i -> Arrays.stream(i).min().orElse(0))
                .sum();
    }
}
