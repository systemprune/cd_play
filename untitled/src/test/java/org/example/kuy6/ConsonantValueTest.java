package org.example.kuy6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsonantValueTest {
    @Test
    public void basicTests() {
        Assertions.assertEquals(26, ConsonantValue.solve("zodiac"));
        Assertions.assertEquals(80, ConsonantValue.solve("chruschtschov"));
        Assertions.assertEquals(38, ConsonantValue.solve("khrushchev"));
        Assertions.assertEquals(57, ConsonantValue.solve("strength"));
        Assertions.assertEquals(73, ConsonantValue.solve("catchphrase"));
        Assertions.assertEquals(103, ConsonantValue.solve("twelfthstreet"));
        Assertions.assertEquals(26, ConsonantValue.solve("z"));
        Assertions.assertEquals(0, ConsonantValue.solve("a"));
        Assertions.assertEquals(26, ConsonantValue.solve("jp"));
    }
}