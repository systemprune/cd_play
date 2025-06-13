package org.example.kuy7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterTheNumber {
    public static long filterString(final String value) {
        return Long.parseLong(Arrays.stream(value.split(""))
                .filter(c -> c.matches("\\d"))
                .collect(Collectors.joining())); // complete this function :)
    }
}
