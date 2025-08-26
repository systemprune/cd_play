package org.example.kuy7;

import java.util.Arrays;

public class StrongNumber {
    public static String isStrongNumber(int num) {
        return Arrays.stream(String.valueOf(num).split(""))
                .mapToInt(i -> fact(Integer.parseInt(i)))
                .sum() == num
                ? "STRONG!!!!":"Not Strong !!";
    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
