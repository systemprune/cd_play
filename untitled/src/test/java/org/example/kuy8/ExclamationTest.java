package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExclamationTest {
    @Test
    public void fixedTests() {
        // assertEquals("expected", "actual");
        assertEquals("Hi", Exclamation.remove("Hi!", 1));
        assertEquals("Hi", Exclamation.remove("Hi!", 100));
        assertEquals("Hi!!", Exclamation.remove("Hi!!!", 1));
        assertEquals("Hi", Exclamation.remove("Hi!!!", 100));
        assertEquals("Hi", Exclamation.remove("!Hi", 1));
        assertEquals("Hi!", Exclamation.remove("!Hi!", 1));
        assertEquals("Hi", Exclamation.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", Exclamation.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", Exclamation.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", Exclamation.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", Exclamation.remove("!!!Hi !!hi!!! !hi", 100));
    }
}