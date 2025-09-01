package org.example.kuy7;

public class Vaporcode {
    public static String vaporcode(String s) {
        return s.replace(" ", "")
                .replace("","  ")
                .toUpperCase()
                .trim();
    }
}
