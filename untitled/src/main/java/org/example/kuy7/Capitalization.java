package org.example.kuy7;

import java.util.Arrays;

public class Capitalization {
    public static String capitalize(String s, int[] ind) {
//        return IntStream.range(0, s.length())
//                .mapToObj(i -> {
//                    if (Arrays.stream(ind).anyMatch(c -> c == i)){
//                        return String.valueOf(s.charAt(i)).toUpperCase();
//                    }
//                    return String.valueOf(s.charAt(i));
//                }).collect(Collectors.joining());
        char[] chars = s.toCharArray();
        Arrays.stream(ind)
                .filter(c -> c < s.length())
                .forEach(c -> chars[c] = Character.toUpperCase(chars[c]));
        return new String(chars);
    }
}
