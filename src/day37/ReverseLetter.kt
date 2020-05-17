package day37

fun reverseLetter(str: String) =
    "[^a-zA-Z]".toRegex().split(str).joinToString("").reversed()
