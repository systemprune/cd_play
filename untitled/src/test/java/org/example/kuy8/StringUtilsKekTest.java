package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsKekTest {
    @Test
    public void fixedTests() {
        assertFalse(StringUtilsKek.isDigit(""));
        assertTrue(StringUtilsKek.isDigit("7"));
        assertFalse(StringUtilsKek.isDigit(" "));
        assertFalse(StringUtilsKek.isDigit("a"));
        assertFalse(StringUtilsKek.isDigit("a5"));
        assertFalse(StringUtilsKek.isDigit("14"));
    }
}