package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaringTest {
    @Test
    void fixed_tests() {
        assertEquals(4, Squaring.square(2));
        assertEquals(2500, Squaring.square(50));
        assertEquals(1, Squaring.square(1));
    }
}