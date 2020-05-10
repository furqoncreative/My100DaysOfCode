package day30

fun alphabetWar(fight: String): String {
    val left = mapOf('w' to 4,'p' to 3, 'b' to 2 , 's' to 1)
    val right = mapOf('m' to 4,'q' to 3, 'd' to 2 , 'z' to 1)
    var r = 0; var l = 0

    fight.replace("[a-z]?\\*[a-z]?".toRegex(), "").forEach {
        if (left.containsKey(it))
            l += left.getValue(it)
        else if (right.containsKey(it)) {
            r += right.getValue(it)
        }
    }
    return if (r>l) "Right side wins!" else if (l>r ) "Left side wins!" else "Let's fight again!"
}

