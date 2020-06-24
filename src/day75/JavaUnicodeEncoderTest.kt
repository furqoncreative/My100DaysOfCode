package day75

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class JavaUnicodeEncoderTest {
    @Test
    @Throws(Exception::class)
    fun decode() {
        assertEquals("hola", JavaUnicodeEncoder.decode("\\u0068\\u006f\\u006c\\u0061"))
    }
    @Test
    @Throws(Exception::class)
    fun encode() {
        assertEquals("\\u0068\\u006f\\u006c\\u0061", JavaUnicodeEncoder.encode("hola"))
    }
}