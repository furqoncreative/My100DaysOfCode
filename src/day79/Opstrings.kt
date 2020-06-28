package day79

import org.junit.Assert

object Opstrings {
    fun rot(strng: String) = strng.reversed()

    fun selfieAndRot(strng: String) =
        strng.split("\n").joinToString("\n") { it + ".".repeat(it.length) } +
                strng.split("\n").reversed().joinToString("\n", "\n")
                { ".".repeat(it.length) + it.reversed() }

    fun oper(f: (String) -> String, s: String) = f(s)
}

private fun testing(actual: String, expected: String) {
    Assert.assertEquals(expected, actual)
}