package org.example.kuy7;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (String.valueOf(Math.abs(max)).length() < String.valueOf(Math.abs(numbers[i])).length()) max = numbers[i];
        }
        return max;
    }
}
