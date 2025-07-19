package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateBMITest {
    @Test
    void testBMI() {
        assertEquals("Underweight", CalculateBMI.bmi(50, 1.80), "For weight = 50 and height = 1.80");
        assertEquals("Normal", CalculateBMI.bmi(80, 1.80), "For weight = 80 and height = 1.80");
        assertEquals("Overweight", CalculateBMI.bmi(90, 1.80), "For weight = 90 and height = 1.80");
        assertEquals("Obese", CalculateBMI.bmi(100, 1.80), "For weight = 100 and height = 1.80");
    }
}