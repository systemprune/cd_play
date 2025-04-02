package org.example.kuy7;

public class Factorial {
    public static long factorial(int n) {
        // your code here
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
