package org.example.kuy8;

public class SumTheStrings {
    public static String sumStr(String a, String b) {
        return String.valueOf(
                Integer.parseInt("".equals(a) ? "0" : a)
                        + Integer.parseInt("".equals(b) ? "0" : b));
    }

}
