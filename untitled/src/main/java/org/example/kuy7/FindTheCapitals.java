package org.example.kuy7;

import java.util.stream.IntStream;

public class FindTheCapitals {
    public static int[] capitals(String s){
        return IntStream.range(0,s.length())
                .filter(c-> s.charAt(c) == s.toUpperCase().charAt(c))
                .toArray();
    }
}
