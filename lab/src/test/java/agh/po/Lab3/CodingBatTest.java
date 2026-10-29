package agh.po.Lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {

    private final CodingBat cb = new CodingBat();

    @Test
    public void sleepIn() {
        assertTrue(cb.sleepIn(false, false));
        assertFalse(cb.sleepIn(true, false));
        assertTrue(cb.sleepIn(false, true));
        assertTrue(cb.sleepIn(true, true));
    }

    @Test
    public void monkeyTrouble() {
        assertTrue(cb.monkeyTrouble(true, true));
        assertTrue(cb.monkeyTrouble(false, false));
        assertFalse(cb.monkeyTrouble(true, false));
        assertFalse(cb.monkeyTrouble(false, true));
    }

    @Test
    public void countEvents() {
        assertEquals(2, cb.countEvents(new int[]{2, 5, 6, 1}));
        assertEquals(4, cb.countEvents(new int[]{2, 4, 6, 8}));
        assertEquals(0, cb.countEvents(new int[]{9, 7, 3, 1}));
        assertEquals(0, cb.countEvents(new int[]{}));
    }

    @Test
    public void helloName() {
        assertEquals("Hello Bob!", cb.helloName("Bob"));
        assertEquals("Hello Alice!", cb.helloName("Alice"));
        assertEquals("Hello maks!", cb.helloName("maks"));
    }
}
