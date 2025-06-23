package org.example.kuy8;

import java.util.List;
import java.util.Random;

public class Ghost {
    public static String getColor() {
        //=> "white" or "yellow" or "purple" or "red"
        List<String> color = List.of("white", "yellow", "purple", "red");
        return color.get(new Random().nextInt(0, 4));
    }
}
