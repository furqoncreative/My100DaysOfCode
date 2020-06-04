package day55

import java.util.function.LongBinaryOperator
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

fun gcdi(xx: Long, yy: Long): Long {
    val x = (1..abs(xx)).filter { xx % it == 0L }
    val y = (1..abs(yy)).filter { yy % it == 0L }
    return (x.filter { y.contains(it) }).max()!!.toLong()
}

fun som(a: Long, b: Long) = a + b
fun maxi(a: Long, b: Long) = max(a, b)
fun mini(a: Long, b: Long) = min(a, b)
fun lcmu(a:Long, b:Long):Long = lcm(abs(a), abs(b))
fun lcm(a: Long, b: Long): Long = (a * b) / gcdi(abs(a), abs(b))


fun operArray(fct: LongBinaryOperator, arr: LongArray, init: Long): LongArray {
    var value = init
    return arr.map {
        value = fct.applyAsLong(it, value)
        value
    }.toLongArray()
}