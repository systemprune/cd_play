package org.example.kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalizedMessageTest {
    @Test
    public void basicTests() {
        assertEquals("Hello boss", PersonalizedMessage.greet("Daniel", "Daniel"));
        assertEquals("Hello guest", PersonalizedMessage.greet("Greg", "Daniel"));
    }
}