package org.example.kuy8;

import java.util.List;

public class MixedSum {
    public int sum(List<?> mixed) {
        return mixed.stream()
                .mapToInt(i -> Integer.parseInt(i.toString()))
                .sum();
    }
}
