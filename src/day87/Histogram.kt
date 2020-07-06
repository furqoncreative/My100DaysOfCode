package day87

fun hist(s: String) = arrayOf("u", "w", "x", "z").filter { s.contains(it) }.joinToString("") { c ->
    val count = s.count { it == c[0] }
    String.format(
        "%s  %d%s%s\r", c, count, " ".repeat(6 - (count.toString() + "").length),
        "*".repeat(count)
    )
}.trim()
