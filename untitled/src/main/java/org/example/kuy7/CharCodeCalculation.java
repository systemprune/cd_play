package org.example.kuy7;

import static java.util.stream.Collectors.joining;

public class CharCodeCalculation {
    public static int calc(String x) {
        return x.chars().mapToObj(i -> "" + i).collect(joining()).replaceAll("[^7]", "").length() * 6;
    }
}
