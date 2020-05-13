package day33

import org.junit.Test

import org.junit.Assert.*

class FindMissingLetterKtTest {

    @Test
    fun exampleTests() {
        assertEquals('e', findMissingLetter(charArrayOf('a', 'b', 'c', 'd', 'f')))
        assertEquals('P', findMissingLetter(charArrayOf('O', 'Q', 'R', 'S')))
    }
}