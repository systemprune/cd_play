package org.example.kuy8;

import java.util.Arrays;

public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(Boolean.TRUE::equals).count();
    }
}
