package day24

import org.junit.Test

import org.junit.Assert.*
import java.io.File
import java.net.URL

class TrickyKotlin6Test {

    @Test
    fun testCase() {
        assertTrue(TrickyKotlin6<String>().classOrSuperClassOf { "" })
        assertTrue(TrickyKotlin6<CharSequence>().classOrSuperClassOf { "" })
        assertTrue(TrickyKotlin6<Comparable<String>>().classOrSuperClassOf { "" })
        assertTrue(TrickyKotlin6<Int>().classOrSuperClassOf { 2333 })
        val num = TrickyKotlin6<Number>()
        assertTrue(num.classOrSuperClassOf { 2333 })
        assertTrue(TrickyKotlin6<Long>().classOrSuperClassOf { 6666L })
        assertTrue(num.classOrSuperClassOf { 6666L })
        assertTrue(TrickyKotlin6<File>().classOrSuperClassOf { File("") })
        assertTrue(TrickyKotlin6<URL>().classOrSuperClassOf { URL("http://ice1000.org") })
        assertTrue(TrickyKotlin6<Collection<String>>().classOrSuperClassOf { listOf("") })
    }
}