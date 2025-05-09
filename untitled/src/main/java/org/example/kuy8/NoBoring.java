package org.example.kuy8;

public class NoBoring {
    public static int noBoringZeros(int n) {
        // your code
        if (n == 0) {
            return 0;
        }

        while (n % 10 == 0) {
            n /= 10;
        }

        return n;
    }
}
