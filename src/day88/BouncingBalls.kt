package day88

fun bouncingBall(h: Double, bounce: Double, window: Double) =
    if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) -1
    else generateSequence(h) { it * bounce }
        .takeWhile { it > window }
        .count() * 2 - 1