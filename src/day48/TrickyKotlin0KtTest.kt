package day48

import org.junit.Test

import org.junit.Assert.*
import java.util.*

class TrickyKotlin0KtTest {

    @Test
    fun testInt() {
        val r = Random(System.currentTimeMillis())
        repeat((0..100).count()) { r.nextInt().let { assertEquals(it, Int(it.toString())) } }
    }
}