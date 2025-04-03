package org.example.kuy6;

import java.util.Arrays;

public class Multiplication {
    public static int [][] multiplicationTable(int n){
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                result[i][j] = (i+1)*(j+1);
            }
        }
        return result;
    }
}
