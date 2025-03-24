package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {
    @Test
    public void test1(){

        assertEquals(61000, Clock.Past(0,1,1));
    }


}