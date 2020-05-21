package day41

fun spinWords(sentence: String) = sentence
    .split(" ")
    .joinToString(" ") { if (it.length >= 5) it.reversed() else it }
