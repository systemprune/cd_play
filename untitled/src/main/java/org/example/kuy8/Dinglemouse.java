package org.example.kuy8;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        int dogYears = 0;
        int catYears = 0;

        if (humanYears >= 1) {
            dogYears = 15;
            catYears = 15;

            if (humanYears >= 2) {
                dogYears = dogYears + 9 + (humanYears - 2) * 5;
                catYears = catYears + 9 + (humanYears - 2) * 4;
            }
        }
        return new int[]{humanYears, catYears, dogYears};
    }
}
