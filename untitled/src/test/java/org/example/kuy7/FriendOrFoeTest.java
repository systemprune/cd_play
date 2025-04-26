package org.example.kuy7;

import org.junit.jupiter.api.Test;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FriendOrFoeTest {
    @Test
    void testFriend() {
        assertEquals(of("Ryan", "Yous"), FriendOrFoe.friend(of("Ryan", "Kieran", "Jason", "Yous")), "Input: [\"Ryan\", \"Kieran\", \"Jason\", \"Yous\"]");
        assertEquals(of(), FriendOrFoe.friend(of("Peter", "Stephen", "Joe")), "Input: [\"Peter\", \"Stephen\", \"Joe\"]");
    }
}