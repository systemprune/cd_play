package org.example.kuy8;

public class Cube {
    public static boolean isCube(int volume, int side) {
        // your code here
        if (volume < 1 || side < 1) return false;
        return Math.pow(side, 3) == volume;
    }
}
