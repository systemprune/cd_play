package org.example.kuy6;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        // Do the magic
        Map<Double, Integer> objectObjectHashMap = new HashMap<>();
        IntStream.range(0, arr.length)
                .forEach( i -> objectObjectHashMap.put(arr[i], objectObjectHashMap.getOrDefault(arr[i], 0) + 1));
        return objectObjectHashMap.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
    }
}
