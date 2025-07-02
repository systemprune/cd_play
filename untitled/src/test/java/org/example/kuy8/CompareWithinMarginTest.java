package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareWithinMarginTest {
    @Test
    public void exampleTestCases() {
        assertEquals(-1, CompareWithinMargin.closeCompare(4, 5));
        assertEquals(0, CompareWithinMargin.closeCompare(5, 5));
        assertEquals(1, CompareWithinMargin.closeCompare(6, 5));
        assertEquals(-1, CompareWithinMargin.closeCompare(-6, -5));

        assertEquals(0, CompareWithinMargin.closeCompare(2, 5, 3));
        assertEquals(1, CompareWithinMargin.closeCompare(8.1, 5, 3));
        assertEquals(-1, CompareWithinMargin.closeCompare(1.99, 5, 3));
    }
}