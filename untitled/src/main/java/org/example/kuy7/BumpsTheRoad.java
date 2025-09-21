package org.example.kuy7;

public class BumpsTheRoad {
    public static String bumps(final String road) {
        return road.replaceAll("[^n]", "").length() < 16 ? "Woohoo!" : "Car Dead"; // your code here
    }
}
