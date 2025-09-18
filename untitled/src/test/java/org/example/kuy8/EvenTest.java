package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.example.kuy8.Even.isEven;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EvenTest {

    @Test
    public void test() {
        assertTrue(isEven(0));
        assertFalse(isEven(0.5));
        assertFalse(isEven(1));
        assertTrue(isEven(2));
        assertTrue(isEven(-4));
    }
}