package day65

object Suite2 {
    fun game(n: Long) = if (n % 2 == 0L) "[${(n / 2) * n}]" else "[${n * n}, 2]"
}