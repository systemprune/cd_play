package org.example.kuy8;

public class Numbers {
    public static double TwoDecimalPlaces(double number)
    {
        //Write your code here
        String result = String.format("%.2f", number);
        return Double.parseDouble(result);
    }
}
