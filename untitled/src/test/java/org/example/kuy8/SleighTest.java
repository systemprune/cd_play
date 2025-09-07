package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleighTest {
    @Test
    public void test_authentication() {
        assertEquals(true, Sleigh.authenticate("Santa Claus", "Ho Ho Ho!"));
        assertEquals(false, Sleigh.authenticate("Santa", "Ho Ho Ho!"));
        assertEquals(false, Sleigh.authenticate("Santa Claus", "Ho Ho Ho"));
    }
}