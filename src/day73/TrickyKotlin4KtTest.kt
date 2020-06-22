package day73

import org.junit.Test

import org.junit.Assert.*
import java.util.*

class TrickyKotlin4KtTest {

    @Test
    fun loopTest() {
        fun loopTester(random: Random, int: Int): Int {
            (1..int).forEach { random.nextInt() }
            return random.nextInt()
        }
        (0..100).forEach {
            val i = System.currentTimeMillis()
            assertEquals(loopTester(Random(i), 10000), loop(Random(i), 10000))
        }
    }
}