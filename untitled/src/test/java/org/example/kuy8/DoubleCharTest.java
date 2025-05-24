package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleCharTest {
    @Test
    void sampleTest() {
        assertEquals("SSttrriinngg",DoubleChar.doubleChar("String"));
        assertEquals("HHeelllloo  WWoorrlldd",DoubleChar.doubleChar("Hello World"));
        assertEquals("11223344!!__  ",DoubleChar.doubleChar("1234!_ "));
    }
}