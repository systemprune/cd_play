package org.example.kuy8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeGonnaSurviveTest {
    @Test
    @DisplayName("A true hero")
    void aTrueHero() {
        assertTrue(HeGonnaSurvive.hero(10, 5), "With 10 bullets and 5 dragons");
        assertTrue(HeGonnaSurvive.hero(100, 40), "With 100 bullets and 40 dragons");
    }

    @Test @DisplayName("A false hero")
    void aFalseHero() {
        assertFalse(HeGonnaSurvive.hero(4, 5), "With 4 bullets and 5 dragons");
        assertFalse(HeGonnaSurvive.hero(1500, 751), "With 1500 bullets and 751 dragons");
        assertFalse(HeGonnaSurvive.hero(0, 1), "With 0 bullets and 1 dragon");
        assertFalse(HeGonnaSurvive.hero(7, 4), "With 7 bullets and 4 dragons");
    }
}