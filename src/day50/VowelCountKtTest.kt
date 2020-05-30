package day50

import org.junit.Test

import org.junit.Assert.*

class VowelCountKtTest {

    @Test
    fun testFixed() {
        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}