package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GodTest {
    @Test
    public void makingAdam(){
        Human[] paradise = God.create();
        assertTrue(paradise[0] instanceof Man);
    }
}