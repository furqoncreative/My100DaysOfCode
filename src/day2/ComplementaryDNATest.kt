package day2

import org.junit.Test

import org.junit.Assert.*

class ComplementaryDNATest {
    @Test
    fun test01() {
        assertEquals("TTTT", ComplementaryDNA.makeComplement("AAAA"));
    }
    @Test
    fun test02() {
        assertEquals("TAACG", ComplementaryDNA.makeComplement("ATTGC"));
    }
}