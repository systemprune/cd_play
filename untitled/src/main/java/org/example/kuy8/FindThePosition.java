package org.example.kuy8;

public class FindThePosition {
    public static String position(char alphabet)
    {
        return "Position of alphabet: " + (Character.toLowerCase(alphabet) - 'a' + 1);
    }
}
