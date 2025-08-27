package org.example.kuy7;

public class Automorphic {
    public static String autoMorphic(int number) {
        return (number * number + "").endsWith(number + "") ? "Automorphic" : "Not!!";
    }
}
