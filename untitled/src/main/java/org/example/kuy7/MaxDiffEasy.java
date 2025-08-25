package org.example.kuy7;

import java.util.Arrays;

public class MaxDiffEasy {
    public static int maxDiff(int[] lst) {
        return lst.length == 0 ? 0 :
                Arrays.stream(lst).max().getAsInt() - Arrays.stream(lst).min().getAsInt();
    }
}
