package day99

object ASum {
    fun findNb(m: Long): Long {
        val b = Math.pow(m.toDouble(), 1.0 / 3.0).toLong()
        var sum = 0L
        (1..b).forEach {
            sum += it * it * it
            if (sum == m) return it
        }
        return -1
    }
}