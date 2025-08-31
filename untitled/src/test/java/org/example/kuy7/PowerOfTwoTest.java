package org.example.kuy7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {
    @Test
    void testPowerOfTwo() {
        assertEquals(true, PowerOfTwo.isPowerOfTwo(   2));
        assertEquals(true, PowerOfTwo.isPowerOfTwo(4096));
    }

    @Test
    void testNotPowersOfTwo() {
        assertEquals(false, PowerOfTwo.isPowerOfTwo(333));
        assertEquals(false, PowerOfTwo.isPowerOfTwo(  0));
        assertEquals(false, PowerOfTwo.isPowerOfTwo(  16741502));
    }
}