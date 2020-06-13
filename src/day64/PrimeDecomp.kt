package day64

object PrimeDecomp {
    fun factors(l: Int): String {
        var p = l
        val result = mutableListOf<String>()
        for (i in 2..p) {
            var n = 0; while (p % i == 0) {
                n++; p /= i
            }
            when {
                n > 1 -> result.add("($i**$n)"); n == 1 -> result.add("($i)")
            }
        }
        return result.joinToString("")
    }
}