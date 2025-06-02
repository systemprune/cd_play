package org.example.kuy8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangoTest {
    private static void doTest(int q, int p, int expected) {
        assertEquals(expected, Mango.mango(q, p), String.format("Incorrect answer for quantity = %d, price = %d", q, p));
    }

    @Test
    @DisplayName("Sample Tests")
    public void sampleTests() {
        doTest(3, 3, 6);
        doTest(9, 5, 30);
    }
}