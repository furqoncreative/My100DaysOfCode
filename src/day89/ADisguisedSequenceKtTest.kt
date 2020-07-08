package day89

import org.junit.Test

import org.junit.Assert.*
import java.math.BigInteger

class ADisguisedSequenceKtTest {

    private fun testing(actual: BigInteger, expected:BigInteger) {
        assertEquals(expected, actual)
    }
    @Test
    fun test1() {
        println("Fixed Tests: fcn")
        testing(fcn(21), BigInteger.valueOf(2097152))
        testing(fcn(43), BigInteger.valueOf(8796093022208L))
    }
}