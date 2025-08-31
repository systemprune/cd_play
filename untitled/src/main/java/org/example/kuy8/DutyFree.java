package org.example.kuy8;

public class DutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) (hol / (normPrice * (discount / 100.0)));
    }
}
