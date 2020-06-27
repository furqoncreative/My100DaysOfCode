package day78

import org.junit.Test

import org.junit.Assert.*

class NextHigherKtTest {

    @Test
    fun basicTests() {
        assertEquals(256, nextHigher(128))
        assertEquals(2, nextHigher(1))
        assertEquals(1279, nextHigher(1022))
        assertEquals(191, nextHigher(127))
        assertEquals(1253359, nextHigher(1253343))
    }

}