package org.example.kuy7;

public class FixStringCase {
    public static String solve(final String str) {
        if (str.length() == 0) return "";
        int length = str.length() / 2;
        int result = 0;

        for (Character c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result++;
            }
        }
        return length >= result ? str.toLowerCase() : str.toUpperCase(); //your code here
    }
}
