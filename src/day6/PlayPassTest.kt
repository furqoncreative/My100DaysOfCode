package day6

import org.junit.Test

import org.junit.Assert.*

class PlayPassTest {

    @Test
    fun basicTests() {

        assertEquals("!4897 Oj oSpC", PlayPass.playPass("BORN IN 2015!", 1))
        assertEquals("!!!VpZ FwPm j ", PlayPass.playPass(" I LOVE YOU!!!", 1))
        assertEquals("!!!uOy eVoL I", PlayPass.playPass("I LOVE YOU!!!", 0))
        assertEquals("zDdCcBbB", PlayPass.playPass("AAABBCCY", 1))

    }
}