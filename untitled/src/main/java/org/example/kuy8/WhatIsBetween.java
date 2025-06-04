package org.example.kuy8;

import java.util.stream.IntStream;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        // your code here
        return IntStream.rangeClosed(a,b).toArray();
    }
}
