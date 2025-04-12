package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveExplMarkTest {
    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", RemoveExplMark.removeExclamationMarks("Hello World!"));
    }
}