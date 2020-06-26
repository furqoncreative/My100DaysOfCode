package day77

fun meeting(s: String) =
    s.toUpperCase().split(';').sorted()
        .map { it -> it.split(':').reversed().let { Pair(it[0], it[1]) } }
        .sortedBy { it.first }
        .joinToString("")