package org.example.kuy7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummingTest {
    private static void doTest(int num, int expected) {
        assertEquals(expected, Summing.sumDigits(num), String.format("Incorrect answer for num = %d\n\n", num));
    }

    @Test
    @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest(10, 1);
        doTest(99, 18);
        doTest(-32, 5);
    }
}