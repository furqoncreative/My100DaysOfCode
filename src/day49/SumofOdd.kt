package day49

fun rowSumOddNumbers(n: Int) = (1 until n*(n+1)).step(2).toList().takeLast(n).sum()
