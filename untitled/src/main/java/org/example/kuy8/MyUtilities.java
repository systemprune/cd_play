package org.example.kuy8;

public class MyUtilities {
    public boolean isDigit(String s) {
        //return true or false
        return s.trim().matches("^[+-]?\\d+(\\.\\d+)?$");
    }
}
