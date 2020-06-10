package day61

fun decode(r: String): String {
    val num = r.filter { it.isDigit() }.toInt()
    val letter = r.filter { it.isLetter() }
    val decode = mutableMapOf<Char, Char>()
    for (i in 0..25) {
        decode[(i * num % 26 + 97).toChar()] = (i + 97).toChar()
    }
    return if (decode.size != 26) "Impossible to decode"
    else letter.map { decode[it] }.joinToString("")
}