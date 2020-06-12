package day63

import org.junit.Test

import org.junit.Assert.*
import java.util.*

class GenerateColorRGBTest {

    @Test
    @Throws(Exception::class)
    fun symbolTest() {
        assertEquals("#", GenerateColorRGB.generateColor(Random()).substring(0, 1))
    }
}