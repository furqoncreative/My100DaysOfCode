package day19

fun sumParts(ls: IntArray): IntArray {
    var sum = ls.sum()
    val result = mutableListOf(sum)

    ls.forEach { sum -= it; result.add(sum) }

     return result.toIntArray()
}
