package org.example.kuy7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VaporcodeTest {
    @Test
    void fixedTests() {
        assertEquals("L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S", Vaporcode.vaporcode("Lets go to the movies"));
        assertEquals("W  H  Y  I  S  N  T  M  Y  C  O  D  E  W  O  R  K  I  N  G", Vaporcode.vaporcode("Why isnt my code working"));
    }
}