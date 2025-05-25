package org.example.kuy8;

import java.util.Arrays;

public class FlattenAndSortAnArray {
    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }

}
