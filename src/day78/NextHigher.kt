package day78

fun nextHigher(n: Int): Int {
    var result = n
    val count = result.toString(2).count { it == '1' }
    while (true) {
        result++
        if (count == result.toString(2).count { it == '1' })
            return result
    }
}