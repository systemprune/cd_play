package org.example.kuy8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UppercaseTest {
    @Test
    @DisplayName("Basic Tests")
    void basicTests() {
        assertFalse(Uppercase.isUpperCase("c"), "Input: 'c'");
        assertTrue(Uppercase.isUpperCase("C"), "Input: 'C'");
        assertFalse(Uppercase.isUpperCase("hello I AM DONALD"), "Input: 'hello I AM DONALD'");
        assertTrue(Uppercase.isUpperCase("HELLO I AM DONALD"), "Input: 'HELLO I AM DONALD'");
        assertFalse(Uppercase.isUpperCase("ACSKLDFJSgSKLDFJSKLDFJ"), "Input: 'ACSKLDFJSgSKLDFJSKLDFJ'");
        assertTrue(Uppercase.isUpperCase("ACSKLDFJSGSKLDFJSKLDFJ"), "Input: 'ACSKLDFJSGSKLDFJSKLDFJ'");
    }
}