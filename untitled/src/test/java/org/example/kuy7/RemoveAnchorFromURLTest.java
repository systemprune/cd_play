package org.example.kuy7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAnchorFromURLTest {

    private static void doTest(String url, String expected) {
        assertEquals(expected, RemoveAnchorFromURL.removeUrlAnchor(url), String.format("Incorrect answer for url = \"%s\"\n\n", url));
    }

    @Test
    @DisplayName("Sample Tests")
    public void testSampleCases() {
        doTest("www.codewars.com#about", "www.codewars.com");
        doTest("www.codewars.com/katas/?page=1#about", "www.codewars.com/katas/?page=1");
        doTest("www.codewars.com/katas/", "www.codewars.com/katas/");
        doTest("https://example.com#section1", "https://example.com");
    }

}