package org.example.kuy7;

public class SequenceSum {
    public static String showSequence(int value) {
        //for
        if (value == 0) return "0=0";
        if (value < 0) return value + "<0";

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i <= value; i++) {
            if (i == value) {
                sb.append(i);
            } else {
                sb.append(i).append("+");
            }
            sum += i;
        }
        return sb.append(" = ").append(sum).toString();
    }
}
