package day66

import org.junit.Test

import org.junit.Assert.*

class AlphabetWarsKtTest {

    @Test
    fun testFixed() {
        assertEquals("Right side wins!", alphabetWar("z"))
        assertEquals("Let's fight again!", alphabetWar("zdqmwpbs"))
        assertEquals("Right side wins!", alphabetWar("zzzzs"))
        assertEquals("Left side wins!", alphabetWar("wwwwww"))
    }
}