package org.example.kuy7;

public class GreetMe {
    public static String greet(String name) {
        StringBuilder sb = new StringBuilder();

        return sb.append("Hello ")
                .append(name.substring(0, 1).toUpperCase())
                .append(name.substring(1).toLowerCase())
                .append("!")
                .toString();
    }
}
