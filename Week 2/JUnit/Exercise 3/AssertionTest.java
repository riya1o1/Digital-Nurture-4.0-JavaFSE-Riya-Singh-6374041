package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionTest {

    @Test
    public void testAssertions() {
        System.out.println("Testing assertEquals: 2 + 3 should equal 5");
        assertEquals(5, 2 + 3);

        System.out.println("Testing assertTrue: 5 > 3 should be true");
        assertTrue(5 > 3);

        System.out.println("Testing assertFalse: 5 < 3 should be false");
        assertFalse(5 < 3);

        Object obj1 = null;
        System.out.println("Testing assertNull: obj1 should be null");
        assertNull(obj1);

        Object obj2 = new Object();
        System.out.println("Testing assertNotNull: obj2 should NOT be null");
        assertNotNull(obj2);
    }
}
