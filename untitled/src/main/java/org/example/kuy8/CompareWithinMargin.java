package org.example.kuy8;

public class CompareWithinMargin {
    public static int closeCompare(double a, double b) {
        return closeCompare(a, b, 0);
    }

    public static int closeCompare(double a, double b, double margin) {
        return Math.abs(a - b) <= margin ? 0 : Double.compare(a, b);
    }
}
