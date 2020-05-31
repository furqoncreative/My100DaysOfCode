package day51

fun findShort(s: String) = s.split(" ").sortedBy { it.length }.take(1).joinToString().length
