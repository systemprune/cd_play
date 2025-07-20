package org.example.kuy8;

public class CalculateBMI {
    /**
     * Write function bmi that calculates body mass index (bmi = weight / height2).
     * if bmi <= 18.5 return "Underweight"
     * if bmi <= 25.0 return "Normal"
     * if bmi <= 30.0 return "Overweight"
     * if bmi > 30 return "Obese"
     */
    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi > 30.0) return "Obese";
        if (bmi <= 30.0 && bmi > 25.0) return "Overweight";
        if (bmi <= 25.0 && bmi > 18.5) return "Normal";
        return "Underweight";
        //ssssssssssssssssssssssssssssssssssssssssssssssssss
    }
}
