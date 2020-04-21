package day11

import org.junit.Test

import org.junit.Assert.*

class FramedReflectionKtTest {

    @Test
    fun `Basic Tests`() {
        assertEquals("*********\n* olleH *\n* dlroW *\n*********", mirror("Hello World"))
        assertEquals("************\n* srawedoC *\n************", mirror("Codewars"))
    }

}