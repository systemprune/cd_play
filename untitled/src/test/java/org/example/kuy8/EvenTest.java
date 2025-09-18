package org.example.kuy8;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenTest {

    @Test
    public void test() {
        Even num = new Even();
        assertEquals(true, num.isEven(0));
        assertEquals(false, num.isEven(0.5));
        assertEquals(false, num.isEven(1));
        assertEquals(true, num.isEven(2));
        assertEquals(true, num.isEven(-4));
    }
}