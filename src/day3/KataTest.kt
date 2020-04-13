package day3

import org.junit.Test

import org.junit.Assert.*

class KataTest {

    @Test
    fun basicTest() {
        assertEquals("es", Kata.getMiddle("test"));
        assertEquals("dd", Kata.getMiddle("middle"));
        assertEquals("t", Kata.getMiddle("testing"));
        assertEquals("A", Kata.getMiddle("A"));
    }
}