package day37

import org.junit.Test

import org.junit.Assert.*

class ReverseLetterKtTest {

    @Test
    fun `Basic Tests` () {
        val str = "krishan"
        assertEquals("nahsirk", reverseLetter("krishan"))
        assertEquals("nortlu", reverseLetter("ultr53o?n"))
        assertEquals("cba", reverseLetter("ab23c"))
        assertEquals("nahsirk", reverseLetter("krish21an"))
    }
}