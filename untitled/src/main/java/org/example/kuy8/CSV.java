package org.example.kuy8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class CSV {
    public static String toCsvText(int[][] array){
        return stream(array)
                .flatMap(i -> Stream.of(stream(i)
                            .mapToObj(String::valueOf)
                            .collect(Collectors.joining(",")))
                )
                .collect(Collectors.joining("\n"));
    }
}
