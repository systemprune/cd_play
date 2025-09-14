package org.example.kuy8;

import java.util.stream.IntStream;

public class RemovingElements2 {
    public static Object[] removeEveryOther(Object[] arr) {
        // happy coding
        return IntStream.range(0, arr.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> arr[i])
                .toArray();
    }
}
