package org.example.kuy8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSV {
    public static String toCsvText(int[][] array){
        return Arrays.stream(array)
                .flatMap(i -> Stream.of(Arrays.stream(i)
                            .mapToObj(String::valueOf)
                            .collect(Collectors.joining(",")))
                )
                .collect(Collectors.joining("\n"));
    }
}
