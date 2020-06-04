package day55

import org.junit.Test

import org.junit.Assert.*
import java.util.function.LongBinaryOperator

@Suppress("NAME_SHADOWING")
class ReducingbystepsKtTest {

    private fun testing(actual:String, expected:String) {
        assertEquals(expected, actual)
    }
    @Test
    fun test0() {
        println("Fixed Tests operArray : gcdi, lcmu, som, mini, maxi")
        val a = longArrayOf(18, 69, -90, -78, 65, 40)
        var r = longArrayOf(18, 3, 3, 3, 1, 1)
        testing(
            operArray(
                LongBinaryOperator { x, y -> gcdi(x, y) },
                a,
                a[0]
            ).contentToString(),
            r.contentToString()
        )
        r = longArrayOf(18, 414, 2070, 26910, 26910, 107640)
        testing(
            operArray(
                LongBinaryOperator { a, b -> lcmu(a, b) },
                a,
                a[0]
            ).contentToString(),
            r.contentToString()
        )
        r = longArrayOf(18, 87, -3, -81, -16, 24)
        testing(
            operArray(LongBinaryOperator { a, b -> som(a, b) }, a, 0).contentToString(),
            r.contentToString()
        )
        r = longArrayOf(18, 18, -90, -90, -90, -90)
        testing(
            operArray(
                LongBinaryOperator { a, b -> mini(a, b) },
                a,
                a[0]
            ).contentToString(),
            r.contentToString()
        )
        r = longArrayOf(18, 69, 69, 69, 69, 69)
        testing(
            operArray(
                LongBinaryOperator { a, b -> maxi(a, b) },
                a,
                a[0]
            ).contentToString(),
            r.contentToString()
        )
    }
}