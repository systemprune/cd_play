package org.example.kuy8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Multiplication {

    public static void main(String[] args) {
        System.out.println(multiTable(5));
    }

    public static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> i + " * " + num + " = " + i * num + "\n")
                .collect(Collectors.joining())
                .trim(); // good luck
    }
}
