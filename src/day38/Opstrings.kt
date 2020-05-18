package day38

import kotlin.reflect.KFunction

object Opstrings {
    fun vertMirror(strng: String): String {
        return strng.split("\n").joinToString("\n") { it.reversed() }
    }
    fun horMirror(strng: String): String {
        return strng.split("\n").reversed().joinToString("\n")
    }
    fun oper(f: KFunction<String>, s: String): String {
        return if (f == Opstrings::horMirror) horMirror(s) else vertMirror(s)
    }
}