package org.example.kuy7;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
        if (n == 0) return false;
        if (n == 1) return true;
        return (n & (n - 1)) == 0;
    }
}
