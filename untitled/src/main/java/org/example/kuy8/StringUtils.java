package org.example.kuy8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtils {
    public static String toAlternativeString(String string) {
        // your code here!
        return Arrays.stream(string.split(""))
                .map(c -> c.equals(c.toUpperCase()) ? c.toLowerCase():c.toUpperCase())
                .collect(Collectors.joining());
    }
}
