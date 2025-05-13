package org.example.kuy7;

public class NthSeries {
    public static String seriesSum(int n) {
        // Happy Coding ^_^
        if (n == 0) return "0.00";
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (3 * i - 2);
        }
        return String.format("%.2f", sum);
    }
}
