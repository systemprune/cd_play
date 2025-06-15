package org.example.kuy8;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class EnumerableMagic {
    public static boolean all(int[] list, IntPredicate predicate){
        // REMINDER: a Predicate "p" is tested for argument "arg" using p.test(arg)
        return Arrays.stream(list).allMatch(predicate);
    }
}
