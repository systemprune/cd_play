package org.example.kuy8;

import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeek {

    public static String getDay(int n) {
        //magic here
        if (n < 1 || n > 7) {
            return "Wrong, please enter a number between 1 and 7";
        }
        int dayTask = n == 1 ? 7 : n - 1;
        return java.time.DayOfWeek.of(dayTask).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
