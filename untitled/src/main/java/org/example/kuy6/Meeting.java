package org.example.kuy6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Meeting {
    public static String meeting(String s) {
        // your code
        return Arrays.stream(s.split(";"))
                .map(n -> n.split(":"))
                .map(p -> new String[]{p[1].toUpperCase(), p[0].toUpperCase()})
                .sorted(Comparator.comparing((String[] arr) -> arr[0]).thenComparing(arr -> arr[1]))
                .map(arr -> "(" + arr[0] + ", " + arr[1] + ")")
                .collect(Collectors.joining());
    }
}
