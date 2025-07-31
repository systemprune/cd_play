package org.example.kuy6;

import java.util.HashMap;
import java.util.Map;

public class ConsonantValue {
    public static int solve(final String s) {
        Map<String, Integer> mapValue = new HashMap<>();
        //DA POCHEMY MAP.OF DOSNT WORK
        mapValue.put("b", 2); mapValue.put("c", 3); mapValue.put("d", 4); mapValue.put("f", 6);
        mapValue.put("g", 7);
        mapValue.put("h", 8);
        mapValue.put("j", 10);
        mapValue.put("k", 11);
        mapValue.put("l", 12);
        mapValue.put("m", 13);
        mapValue.put("n", 14);
        mapValue.put("p", 16);
        mapValue.put("q", 17);
        mapValue.put("r", 18);
        mapValue.put("s", 19);
        mapValue.put("t", 20);
        mapValue.put("v", 22);
        mapValue.put("w", 23);
        mapValue.put("x", 24);
        mapValue.put("y", 25);
        mapValue.put("z", 26);

        int max = 0;
        int current = 0;

        String[] strings = s.split("");
        for (String c : strings) {
            if (mapValue.containsKey(c)) {
                current += mapValue.get(c);
                if (max < current) {
                    max = current;
                }
            } else {
                current = 0;
            }
        }
        return max;
    }
}
