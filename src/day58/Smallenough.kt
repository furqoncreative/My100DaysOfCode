package day58

fun smallEnough(a: IntArray, limit: Int): Boolean {
    a.forEach { if (it > limit) return false }
    return true
}