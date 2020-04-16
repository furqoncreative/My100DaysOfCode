package day7

import org.junit.Test

import org.junit.Assert.*

class FindTheParityTest {

    @Test
    fun testExample() {
        val exampleTest1 = arrayOf(2,0,-3)
        val exampleTest2 = arrayOf(206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781)
        val exampleTest3 = arrayOf(Integer.MAX_VALUE, 0, 1)
        assertEquals(-3, FindTheParity.find(exampleTest1))
        assertEquals(206847684, FindTheParity.find(exampleTest2))
        assertEquals(0, FindTheParity.find(exampleTest3))
    }
}