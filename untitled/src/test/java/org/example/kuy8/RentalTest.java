package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {
    @Test
    public void under3Tests() {
        assertEquals(40, Rental.rentalCarCost(1));
        assertEquals(80, Rental.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, Rental.rentalCarCost(3));
        assertEquals(140, Rental.rentalCarCost(4));
        assertEquals(180, Rental.rentalCarCost(5));
        assertEquals(220, Rental.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, Rental.rentalCarCost(7));
        assertEquals(270, Rental.rentalCarCost(8));
        assertEquals(310, Rental.rentalCarCost(9));
        assertEquals(350, Rental.rentalCarCost(10));
    }
}