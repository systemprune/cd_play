package org.example.kuy8;

import org.junit.jupiter.api.*;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TheFunctionTest {
    @DisplayName("Test true") @Order(1)
    @Test
    void testTrue() {
        AtomicReference<String> actual = new AtomicReference<>("no function");
        TheFunction._if(true, () -> actual.set("true function"), () -> actual.set("false function"));
        assertEquals("true function", actual.get());
    }

    @DisplayName("Test false") @Order(2)
    @Test void testFalse() {
        AtomicReference<String> actual = new AtomicReference<>("no function");
        TheFunction._if(false, () -> actual.set("true function"), () -> actual.set("false function"));
        assertEquals("false function", actual.get());
    }

    @DisplayName("Test falsy value (null)") @Order(3)
    @Test void testFalsy() {
        AtomicReference<String> actual = new AtomicReference<>("no function");
        TheFunction._if(null, () -> actual.set("true function"), () -> actual.set("false function"));
        assertEquals("false function", actual.get());
    }
}