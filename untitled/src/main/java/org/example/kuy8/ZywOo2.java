package org.example.kuy8;

import java.util.Arrays;
import java.util.Comparator;

public class ZywOo2 {
    public static int sumOfDifferences(int[] arr) {
        //your code;
        Integer[] s = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);

        int result = 0;
        for (int i = 0; i < s.length - 1; i++) {
            result += s[i] - s[i + 1];
        }

        return result;
    }
}
