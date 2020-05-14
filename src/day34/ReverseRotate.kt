package day34

import kotlin.math.pow

fun revRot(nums:String, sz:Int): String {
    return if(sz <= 0 ) ""
    else nums.chunked(sz).joinToString("") {
        val sum = it.chunked(1).map { it.toDouble().pow(3.0) }.sum().toInt()
        if (sum % 2 == 0) it.reversed()
        else it.drop(1) + it[0]
    }.dropLast(nums.length%sz)
}
