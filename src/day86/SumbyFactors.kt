package day86

fun sumOfDivided(l: IntArray) =
    if (l.isEmpty()) ""
    else (2..l.max()!!).filter { isPrime(it) && l.any { n -> n % it == 0 } }
        .joinToString("") {
            "($it ${l.filter { i -> i % it == 0 }.sum()})"
        }

fun isPrime(n: Int) =
    (2..Math.sqrt(n.toDouble()).toInt()).all { n % it != 0 }