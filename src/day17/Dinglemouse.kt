package day17

import kotlin.math.abs
object Dinglemouse {
    fun int123(a: Int): Long {
        val b = 123L -a
        return if(b>=0) b else (Long.MAX_VALUE - abs(b+1))
    }
}