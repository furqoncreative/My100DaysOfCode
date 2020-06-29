package day80

fun productFib(prod: Long): LongArray {
    var (a, b, c) = longArrayOf(0, 1, 0)
    while (c < prod) {
        a = b.also { b += a }
        c = a * b
    }
    return longArrayOf(a, b, if (c == prod) 1L else 0L)
}