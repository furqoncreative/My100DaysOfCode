package day93

import org.junit.Test

import org.junit.Assert.*

class TortoiseKtTest {

    @Test
    fun test1() {
        println("Basic Tests")
        assertArrayEquals(intArrayOf(0, 32, 18), race(720, 850, 70))
        assertArrayEquals(intArrayOf(3, 21, 49), race(80, 91, 37))

    }
}