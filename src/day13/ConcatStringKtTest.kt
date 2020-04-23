package day13

import org.junit.Test
import kotlin.random.Random
import org.junit.Assert.*

class ConcatStringKtTest {

//    @Test
//    fun cannotUseFun() = try {
//        Files.lines(File("/home/codewarrior/solution.txt").toPath()).forEach { line ->
//            assertFalse { "fun" in line }
//            assertFalse { "{" in line }
//            assertFalse { "}" in line }
//        }
//    } catch (e: IOException) {
//        fail("Failed to read the source file.")
//    }

    @Test
    fun fixedTest() {
        assertEquals("ice1000", concatString("ice", "1000"))
    }

    @Test
    fun randomTest() {
        val r = Random(System.currentTimeMillis())
        (0..100).forEach {
            val a = r.nextInt().toString(2)
            val b = r.nextInt().toString(2)
            assertEquals(a + b, concatString(a, b))
        }
    }
}