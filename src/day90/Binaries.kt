package day90

fun code(str: String): String {
    return str.map {
        val binarry = Integer.toBinaryString(it.toString().toInt())
        "${"0".repeat(binarry.length - 1)}1$binarry"
    }.joinToString("")
}

fun decode(string: String): String {
    val result = StringBuilder()
    val matcher = "0*1".toPattern().matcher(string)
    var start = 0
    while (matcher.find(start)) {
        val binary = string.substring(matcher.end(), matcher.end() + matcher.group().length)
        val decimal = binary.toInt(2)
        result.append(decimal)
        start += binary.length * 2
    }
    return result.toString()
}
