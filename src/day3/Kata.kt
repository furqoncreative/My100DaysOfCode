package day3

object Kata{
    fun getMiddle(w : String) : String {
        val len = w.length
        return w.substring (len / 2 - (len + 1) % 2, len / 2 + 1)
    }
}
