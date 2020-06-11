package day62

import java.util.function.IntUnaryOperator

fun rectangleRotation(a: Int, b: Int): Int {
    val f1 = IntUnaryOperator { n: Int -> (2 * Math.floor(n / (2 * Math.sqrt(2.0))) + 1).toInt() }
    val f2 = IntUnaryOperator { n: Int -> (2 * Math.floor((n - Math.sqrt(2.0)) / (2 * Math.sqrt(2.0))) + 2).toInt() }
    return (f1.applyAsInt(a) * f1.applyAsInt(b)) + (f2.applyAsInt(a) * f2.applyAsInt(b))
}