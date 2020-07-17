package day98

import org.junit.Test

import org.junit.Assert.*

class PlayingWithDigitsKtTest {

    @Test
    fun testFixed() {
        assertEquals(1, digPow(89, 1))
        assertEquals(-1, digPow(92, 1))
        assertEquals(51, digPow(46288, 3))
    }
}