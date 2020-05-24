package day44

import org.junit.Test

import org.junit.Assert.*

class MultiplesKtTest {

    @Test
    fun testFixed() {
        assertEquals(23, solution(10))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
    }
}