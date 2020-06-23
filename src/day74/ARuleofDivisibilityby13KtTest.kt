package day74

import org.junit.Test

import org.junit.Assert.*

class ARuleofDivisibilityby13KtTest {

    @Test
    fun test1() {
        println("Fixed Tests: thirt")
        testing(thirt(8529), 79)
        testing(thirt(85299258), 31)

    }
    companion object {
        private fun testing(actual:Long, expected:Long) {
            assertEquals(expected, actual)
        }
    }
}