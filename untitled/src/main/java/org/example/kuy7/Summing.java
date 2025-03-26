package org.example.kuy7;

import java.util.Arrays;

public class Summing {
    public static int sumDigits(int number){
        return Arrays.stream(String.valueOf(Math.abs(number)).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
