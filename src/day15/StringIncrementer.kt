package day15

fun incrementString(str: String): String {
    val letter: MutableList<Char> = ArrayList()
    val num: MutableList<Char> = ArrayList()

    str.forEach {
        if (it.isLetter()) letter.add(it) else num.add(it)
    }

    if (num.size == 0) num.add('0')
    return letter.joinToString("") + ((num.joinToString("").toInt()) + 1).toString().padStart(num.size, '0')
}