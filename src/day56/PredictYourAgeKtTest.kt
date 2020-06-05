package day56

import org.junit.Test

import org.junit.Assert.*

class PredictYourAgeKtTest {

    @org.junit.Test
    @Throws(Exception::class)
    fun basicTest() {
        assertEquals(86, predictAge(65, 60, 75, 55, 60, 63, 64, 45))
        assertEquals(79, predictAge(32, 54, 76, 65, 34, 63, 64, 45))
    }
}