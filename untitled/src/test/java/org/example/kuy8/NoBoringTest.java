package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoBoringTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: noBoringZeros");
        testing(NoBoring.noBoringZeros(1450), 145);
        testing(NoBoring.noBoringZeros(960000), 96);
        testing(NoBoring.noBoringZeros(1050), 105);
        testing(NoBoring.noBoringZeros(-1050), -105);
    }
}