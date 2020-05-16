package day36

import org.junit.Test

import org.junit.Assert.*

class DecodeMorseKtTest {

    @Test
    fun exampleTestCases() {
        assertEquals("HEY JUDE", decodeMorse(".... . -.--   .--- ..- -.. ."))
    }
}