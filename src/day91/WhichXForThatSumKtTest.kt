package day91

import org.junit.Test

import org.junit.Assert.*

class WhichXForThatSumKtTest {

    private fun assertFuzzy(m:Double, expect:Double) {
        val merr = 1e-12
        println("Testing " + m)
        val actual = solve(m)
        println("Actual: " + actual)
        println("Expect: " + expect)
        val inrange = Math.abs(actual - expect) <= merr
        if (inrange == false)
        {
            println("Expected must be near " + expect + ", got " + actual)
        }
        println("-")
        assertEquals(true, inrange)
    }
    @Test
    fun test1() {
        assertFuzzy(2.00, 5.000000000000e-01)
        assertFuzzy(4.00, 6.096117967978e-01)
        assertFuzzy(5.00, 6.417424305044e-01)

    }
}