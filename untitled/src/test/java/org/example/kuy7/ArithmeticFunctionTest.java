package org.example.kuy7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticFunctionTest {
    @Test
    public void testBasic() {
        assertEquals( 3, ArithmeticFunction.arithmetic(1, 2, "add"));
        assertEquals(6, ArithmeticFunction.arithmetic(8, 2, "subtract"));
        assertEquals(10, ArithmeticFunction.arithmetic(5, 2, "multiply"));
        assertEquals( 4, ArithmeticFunction.arithmetic(8, 2, "divide"));
    }
}