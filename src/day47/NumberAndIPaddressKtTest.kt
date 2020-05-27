package day47

import org.junit.Test

import org.junit.Assert.*

class NumberAndIPaddressKtTest {

    @Test
    fun testFixed() {
        assertEquals("167773121", numberAndIPaddress("10.0.3.193"))
        assertEquals("10.3.3.193", numberAndIPaddress("167969729"))
    }
}