package org.example.kuy7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mumbling
{

    public static String accum(String s) {
        // your code
        return IntStream.range(0, s.length())
                .mapToObj(i-> {
                    char c = s.charAt(i);
                    return String.valueOf(c).toUpperCase() + String.valueOf(c).repeat(i).toLowerCase();
                })
                .collect(Collectors.joining("-"));
    }
}
