package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCombinerTest {

    @Test
    void test() {
        assertEquals("James Stevens",
                StringCombiner.combineNames("James","Stevens"));
    }
}