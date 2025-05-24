package org.example.kuy8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DoubleChar {
    public static String doubleChar(String s){
        //enter your code here
        return Arrays.stream(s.split(""))
                .map(c -> c + c)
                .collect(Collectors.joining());
    }
}
