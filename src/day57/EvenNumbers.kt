package day57

fun evenNumbers(array: List<Int>, n: Int) = array.filter { it%2==0 }.takeLast(n)
