package org.example.kuy6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WriteNumberTest {
    @Test
    void sampleTests() {
        doTest(2, "2");
        doTest(12, "10 + 2");
        doTest(4982342, "4000000 + 900000 + 80000 + 2000 + 300 + 40 + 2");
        doTest(9000000, "9000000");
        doTest(Integer.MAX_VALUE, "2000000000 + 100000000 + 40000000 + " +
                "7000000 + 400000 + 80000 + 3000 + 600 + 40 + 7");
    }

    private static void doTest(int n, String expected) {
        String message = String.format("for n = %d\n", n);
        String actual = WriteNumber.expandedForm(n);
        assertEquals(expected, actual, message);
    }
}