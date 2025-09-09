package org.example.kuy7;

import org.junit.jupiter.api.Test;

import static org.example.kuy7.Capitalization.capitalize;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizationTest {
    @Test
    public void basicTest(){
        assertEquals("aBCdeF", capitalize("abcdef", new int[]{1,2,5}));
        assertEquals("aBCdeF", capitalize("abcdef", new int[]{1,2,5,100}));
        assertEquals("cOdEwArs", capitalize("codewars", new int[]{1,3,5,50}));
        assertEquals("abRacaDabRA", capitalize("abracadabra", new int[]{2,6,9,10}));
        assertEquals("codewArriors", capitalize("codewarriors", new int[]{5}));
    }
}