package day20

import org.junit.Test

import org.junit.Assert.*

class IntToIp4KtTest {

    @Test
    fun sampleTest() {
        assertEquals("128.114.17.104", longToIP(2154959208u))
        assertEquals("0.0.0.0", longToIP(0u))
        assertEquals("128.32.10.1", longToIP(2149583361u))
    }
}