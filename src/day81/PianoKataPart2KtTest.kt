package day81

import org.junit.Assert.assertEquals
import org.junit.Test

class PianoKataPart2KtTest {
    @Test
    fun exampleTests() {
        assertEquals("A", whichNote(1))
        assertEquals("C#", whichNote(5))
        assertEquals("G#", whichNote(12))
        assertEquals("D", whichNote(42))
        assertEquals("C", whichNote(88))
        assertEquals("A", whichNote(89))
        assertEquals("C", whichNote(92))
        assertEquals("G#", whichNote(100))
        assertEquals("G", whichNote(111))
        assertEquals("G#", whichNote(200))
        assertEquals("F", whichNote(2017))
    }
}