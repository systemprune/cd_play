package org.example.kuy7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindTheCapitalsTest {
    private static void doTest(String s, int[] expected) {
        int[] actual = FindTheCapitals.capitals(s);
        assertArrayEquals(expected, actual, "Incorrect answer for s = \"" + s + "\"\nExpected: " + Arrays.toString(expected) + "\nBut got : " + Arrays.toString(actual) + "\n\n");
    }

    @Test
    @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("CodEWaRs", new int[]{0, 3, 4, 6});
        doTest("aAbB", new int[]{1, 3});
        doTest("AAA", new int[]{0, 1, 2});
        doTest("abcdefghijklmnopqrstuvwxyz", new int[]{});
        doTest("ZYXWVUTSRQPONMLKJIHGFEDCBA", new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25});
        doTest("", new int[]{});
    }
}