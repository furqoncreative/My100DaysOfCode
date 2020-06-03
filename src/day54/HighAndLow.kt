package day54

fun highAndLow(numbers: String): String {
    val num = numbers.split(' ').map { it.toInt() }
    return "${num.max()} ${num.min()}"
}