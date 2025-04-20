package org.example.kuy7;

public class SortedYes {

    public static String isSortedAndHow(int[] array) {
        boolean desc = false;
        boolean asc = false;
        for(int i = 1; i < array.length; i++) {
            if(array[i] > array[i-1]) asc = true;
            if(array[i] < array[i-1]) desc = true;
        }
        if(asc && !desc) return "yes, ascending";
        if(desc && !asc) return "yes, descending";
        return "no";
    }
}
