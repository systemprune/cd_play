package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataExampleTwistTest {
    @Test
    public void test(){
        String[] websites = KataExampleTwist.kataExampleTwist();
        assertTrue(websites.length > 0);
        assertEquals(1000, websites.length);
        boolean allCodewars = true;
        for (String website : websites)
            if (!"codewars".equals(website)) {
                allCodewars = false;
                break;
            }
        assertTrue(allCodewars);
    }
}