package day29

fun encryptThis(text:String): String{
    return text.split(" ").map {
        it.mapIndexed { i, c ->
            when (i) {
                0 -> c.hashCode()
                1 -> it.last()
                it.lastIndex -> it[1]
                else -> c
            }
        }.joinToString("")
    }.joinToString(" ")
}