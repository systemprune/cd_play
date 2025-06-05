package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExclamationMarksTestTest {
    @Test
    void sampleTests() {
        assertEquals("Hi!", ExclamationMarks.remove("Hi!"), "For input \"Hi!\"");
        assertEquals("Hi!", ExclamationMarks.remove("Hi!!!"), "For input \"Hi!!!\"");
        assertEquals("Hi!", ExclamationMarks.remove("!Hi"), "For input \"!Hi\"");
        assertEquals("Hi!", ExclamationMarks.remove("!Hi!"), "For input \"!Hi!\"");
        assertEquals("Hi Hi!", ExclamationMarks.remove("Hi! Hi!"), "For input \"Hi! Hi!\"");
        assertEquals("Hi!", ExclamationMarks.remove("Hi"), "For input \"Hi\"");
    }
}