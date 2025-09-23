package org.example.kuy7;

import java.util.Arrays;

public class FruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length == 0) return new String[]{};
        // code here
        return Arrays.stream(fruitBasket)
                .map(f -> f.replace("rotten", "").toLowerCase())
                .toArray(String[]::new);
    }
}
