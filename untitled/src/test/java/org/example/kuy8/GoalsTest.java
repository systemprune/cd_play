package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoalsTest {
    @Test
    public void basicTests() {
        assertEquals(0, Goals.goals(0, 0, 0));
        assertEquals(58, Goals.goals(43, 10, 5));
    }
}