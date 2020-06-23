package day74

fun thirt(n: Long): Long {
    val pattern = longArrayOf(1, 10, 9, 12, 3, 4)
    var result = n
    while (true) {
        val temp = result.toString().reversed().mapIndexed { i, c ->
            pattern[i % pattern.size] * c.toString().toLong()
        }.sum()
        if (result == temp) return result; result = temp
    }
}