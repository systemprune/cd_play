package org.example.kuy7;

import java.util.List;
import java.util.stream.IntStream;

public class FindTheVowels {
    public static int[] vowelIndices(String word) {
        List<Character> e = List.of('e' , 'y' , 'u' , 'i' , 'o' , 'a');
        String lowerCase = word.toLowerCase();
        return IntStream.range(0, lowerCase.length())
                .filter(c -> e.contains(lowerCase.charAt(c)))
                .map(i -> i + 1)
                .toArray();
    }
}
