package day51

import org.junit.Test

import org.junit.Assert.*

class ShortestWordKtTest {

    @Test
    fun testFixed() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
    }
}