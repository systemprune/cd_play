package org.example.kuy7;

  
import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestValueOfAnArray {
    public static int findSmallest(int[] numbers, String mode) {
        int min = Arrays.stream(numbers).min().orElse(-1);
        switch (mode) {
            case "value" -> {
                return min;
            }
            case "index" -> {
                return IntStream.range(0, numbers.length)
                        .filter(i -> numbers[i] == min)
                        .findFirst()
                        .orElse(-1);
            }
        }
        return -1;
    }
}
