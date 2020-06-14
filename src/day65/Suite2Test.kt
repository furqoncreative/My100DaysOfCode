package day65

import org.junit.Test

import org.junit.Assert.*

class Suite2Test {
    @Test
    fun basicTests() {
        assertEquals("[800]", Suite2.game(40))
        assertEquals("[10201, 2]", Suite2.game(101))
    }
}