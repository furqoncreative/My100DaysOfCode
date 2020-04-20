package day10

fun findScreenHeight(width: Int, ratio: String): String {
    val r = ratio.split(":").toTypedArray()
    return width.toString() + "x"+ width * r[1].toInt() / r[0].toInt()
}