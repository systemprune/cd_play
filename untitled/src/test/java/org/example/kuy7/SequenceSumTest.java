package org.example.kuy7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceSumTest {
    @Test
    public void testBasic() {
        assertEquals("0+1+2+3+4+5+6 = 21",SequenceSum.showSequence(6));
    }
}