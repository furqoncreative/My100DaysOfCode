package day67

fun wave(str: String): List<String> {
    val result = mutableListOf<String>()
    for (i in str.indices) {
        if (str[i] != ' ') result.add(str.replaceRange(i, i + 1, str[i].toUpperCase().toString()))
    }
    return result
}