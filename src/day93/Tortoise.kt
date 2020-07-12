package day93

fun race(v1: Int, v2: Int, g: Int) = if (v1 >= v2) intArrayOf() else {
    val time = g * 3600 / (v2 - v1)
    intArrayOf(time / 3600, (time / 60) % 60, time % 60)
}
