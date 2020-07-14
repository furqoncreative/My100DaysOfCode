package day95

import org.junit.Test

import org.junit.Assert.*

class SimpleStringExpansionKtTest {

    @Test
    fun sampleTestCases() {
        assertEquals(stringExpansion("3D2a5d2f"),"DDDaadddddff")
        assertEquals(stringExpansion("3abc"),"aaabbbccc")
        assertEquals(stringExpansion("abcd"), "abcd")
    }
}