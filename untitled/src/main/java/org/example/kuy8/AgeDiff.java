package org.example.kuy8;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        int div = yearTo - birth;
        return div == 0
                ? "You were born this very year!" : div == 1
                ? "You are 1 year old." : div > 1
                ? "You are " + div + " years old." : div == -1
                ? "You will be born in " + Math.abs(div) + " year." : "You will be born in " + Math.abs(div) + " years.";
    }
}
