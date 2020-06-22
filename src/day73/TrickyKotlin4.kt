package day73

import org.junit.Assert
import org.junit.Test
import java.util.*

fun loop(random: Random, int: Int): Int {
    repeat(int) { random.nextInt() }
    return random.nextInt()
}

@Test
fun loopTest() {
    fun loopTester(random: Random, int: Int): Int {
        (1..int).forEach { random.nextInt() }
        return random.nextInt()
    }
    (0..100).forEach {
        val i = System.currentTimeMillis()
        Assert.assertEquals(loopTester(Random(i), 10000), loop(Random(i), 10000))
    }
}