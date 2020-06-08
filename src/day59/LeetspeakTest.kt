package day59

import org.junit.Test

import org.junit.Assert.*

class LeetspeakTest {

    private var myEncoder: Leetspeak = Leetspeak()

    @Test
    fun simpleTest() {
        assertTrue("empty string", myEncoder.encode("") == "")
        assertTrue("abcdef string", myEncoder.encode("abcdef") == "4bcd3f")
    }
}