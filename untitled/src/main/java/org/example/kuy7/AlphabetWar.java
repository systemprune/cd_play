package org.example.kuy7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AlphabetWar {
    public static String alphabetWar(String fight) {
        int sum = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('w' , 4);
        map.put('p' , 3);
        map.put('b' , 2);
        map.put('s' , 1);
        map.put('m' , 4);
        map.put('q' , 3);
        map.put('d' , 2);
        map.put('z' , 1);

        Set<Character> l = Set.of('w' , 'p' , 'b' , 's');
        Set<Character> r = Set.of('m' , 'q' , 'd' , 'z');

        for (int i = 0; i < fight.length(); i++) {
            if (l.contains(fight.charAt(i))) {
                sum -= map.get(fight.charAt(i));
            } else if (r.contains(fight.charAt(i))) {
                sum += map.get(fight.charAt(i));
            }
        }
        return sum == 0
                ? "Let's fight again!" : sum > 0
                ? "Right side wins!" : "Left side wins!";
    }
}
