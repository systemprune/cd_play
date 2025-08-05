package org.example.kuy8;

public class MultiplyTheNumber {
    public static int multiply(int number) {
        // Your code here
        return (int) (number * Math.pow(5, String.valueOf(Math.abs(number)).length()));
    }
}
