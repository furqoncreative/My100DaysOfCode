package day75

object JavaUnicodeEncoder {
    fun decode(input: String?) = input?.split("\\u")
        ?.filter { it.isNotBlank() }?.map {
            Integer.parseInt(it, 16).toChar()
        }?.joinToString("") ?: ""

    fun encode(input: String?) = input?.map {
        it.toInt().toString(16).padStart(4, '0')
    }?.joinToString("\\u", "\\u") ?: ""
}