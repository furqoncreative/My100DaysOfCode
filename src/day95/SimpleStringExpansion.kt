package day95

fun stringExpansion(s: String): String {
    var result = "" ; var n = 1
    s.forEach {
        if (it.isDigit()) n = it.toString().toInt()
        else result += it.toString().repeat(n)
    }
    return result
}