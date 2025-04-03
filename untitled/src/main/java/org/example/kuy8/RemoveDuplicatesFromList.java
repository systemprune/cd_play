package org.example.kuy8;

import java.util.Arrays;

public class RemoveDuplicatesFromList {
    public static int[] distinct(int[] array){
        // your solution here
        return Arrays.stream(array).distinct().toArray();
    }
}
