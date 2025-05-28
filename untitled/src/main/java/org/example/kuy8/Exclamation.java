package org.example.kuy8;

public class Exclamation {
    public static String remove(String s, int n){
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '!' && n > 0) {
                n--;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
