package day68

import java.util.function.UnaryOperator

fun highlight(code: String): String {
    val highlight = UnaryOperator { color: String ->
        String.format("<span style=\"color: %s\">$1</span>", color)
    }
    return code.replace("(F+)".toRegex(), highlight.apply("pink"))
        .replace("(L+)".toRegex(), highlight.apply("red"))
        .replace("(R+)".toRegex(), highlight.apply("green"))
        .replace("(\\d+)".toRegex(), highlight.apply("orange"))
}