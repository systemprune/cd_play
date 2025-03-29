package org.example.kuy7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Remover {
    public static int[] removeSmallest(int[] numbers) {
        //show me the code!
        int min = Arrays.stream(numbers).min().orElse(0);
        int integerStream = IntStream.range(0, numbers.length)
                .filter(i -> numbers[i] == min)
                .findFirst().orElse(-1);
        return IntStream.range(0, numbers.length)
                .filter(i -> i != integerStream)
                .map(i -> numbers[i])
                .toArray();
    }
}
