package day26

import org.junit.Test

import org.junit.Assert.*

class TrickyKotlin7KtTest {

    @Test
    fun exampleTests() {
        assertEquals("You {{need}} <extra> time ( or money )", f("You }}need{{ >extra< time ) or money ("))
        assertEquals("<br/>", f(">br/<"))
    }
}