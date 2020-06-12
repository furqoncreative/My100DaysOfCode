package day63

import java.util.*


object GenerateColorRGB {
    fun generateColor(random: Random) =
        (1..3).joinToString("", "#") { random.nextInt(256).toString(16).padStart(2, '0') }
}

fun generateColor(random: Random) =
    (1..3).joinToString("", "#") { random.nextInt(256).toString(16).padStart(2, '0') }
