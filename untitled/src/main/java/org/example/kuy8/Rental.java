package org.example.kuy8;

public class Rental {
    public static int rentalCarCost(int d) {
        // Your solution here
        if (d == 0) return 0;
        int i = d * 40;
        if (d >= 7) return i - 50;
        else if (d >= 3) return i - 20;
        else return i;
    }
}
