package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeekTest {
    @Test
    void testSomething() {
        assertEquals("Sunday",DayOfWeek.getDay(1));
        assertEquals("Monday",DayOfWeek.getDay(2));
        assertEquals("Tuesday",DayOfWeek.getDay(3));
        assertEquals("Wednesday",DayOfWeek.getDay(4));
        assertEquals("Thursday",DayOfWeek.getDay(5));
        assertEquals("Friday",DayOfWeek.getDay(6));
        assertEquals("Saturday",DayOfWeek.getDay(7));
        assertEquals("Wrong, please enter a number between 1 and 7",DayOfWeek.getDay(8));
        assertEquals("Wrong, please enter a number between 1 and 7",DayOfWeek.getDay(20));
    }
}