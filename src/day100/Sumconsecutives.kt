package day100

fun sumConsecutives(s: List<Int>) = mutableListOf(s[0]).also {
    (1..s.lastIndex).forEach { i ->
        if (s[i] == s[i - 1]) it[it.lastIndex] += s[i] else it.add(s[i])
    }
}