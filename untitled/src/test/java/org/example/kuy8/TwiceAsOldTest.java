package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwiceAsOldTest {
    @Test
    void sampleTests() {
//         father, son, expected
        doTest(30, 0, 30);
        doTest(30, 7, 16);
        doTest(45, 30, 15);
        doTest(36, 7, 22);
        doTest(55, 30, 5);
        doTest(42, 21, 0);
        doTest(22, 1, 20);
        doTest(29, 0, 29);
    }

    private static void doTest(int father, int son, int expected) {
        String message = String.format("father is %d years old, son is %d year(s) old\n", father, son);
        int actual = twiceAsOld(father, son);
        assertEquals(expected, actual, message);
    }

    private static int twiceAsOld(int dadYears, int sonYears) {
        java.lang.reflect.Method method = null;
        try { // old solutions
            method = TwiceAsOld.class.getDeclaredMethod("TwiceAsOld", int.class, int.class);
        } catch (NoSuchMethodException ignore) { // new solutions
            try {
                method = TwiceAsOld.class.getDeclaredMethod("twiceAsOld", int.class, int.class);
            } catch (NoSuchMethodException ignoreToo) {}
        }
        try {
            return (int) method.invoke(null, dadYears, sonYears);
        } catch (Exception cause) {
            throw new RuntimeException(cause);
        }
    }
}