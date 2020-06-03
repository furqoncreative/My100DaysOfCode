package day54

import org.junit.Test

import org.junit.Assert.*

class HighAndLowKtTest {

    @Test
    fun testFixed() {
        assertEquals("42 -9", highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
    }
}