package org.example.kuy8;

import java.util.Arrays;

public class AddLength {
    public static String[] addLength(String str){
     return  Arrays.stream(str.split(" "))
                .map(l -> l + " " + l.length())
                .toArray(String[]::new);
    }
}
