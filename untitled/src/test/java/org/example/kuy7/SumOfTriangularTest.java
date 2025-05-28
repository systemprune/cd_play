package org.example.kuy7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTriangularTest {
    @Test
    public void basicTests() {
        assertEquals(56, SumOfTriangular.sumTriangularNumbers(6));
        assertEquals(7140, SumOfTriangular.sumTriangularNumbers(34));
        assertEquals(0, SumOfTriangular.sumTriangularNumbers(-291));
        assertEquals(140205240, SumOfTriangular.sumTriangularNumbers(943));
        assertEquals(0, SumOfTriangular.sumTriangularNumbers(-971));
    }
}