package day59

class Leetspeak: Encoder() {
    private val dictionary = mapOf("a" to "4", "e" to "3", "l" to "1", "m" to "/^^\\", "o" to "0", "u" to "(_)")
    override fun encode(source: String?) =
        source?.chunked(1)?.joinToString("") { dictionary[it.toLowerCase()] ?: it } ?: ""
}

abstract class Encoder {
    abstract fun encode(source: String?): String
}