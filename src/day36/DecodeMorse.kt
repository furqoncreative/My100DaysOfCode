package day36

val MorseCode = mapOf(".-" to "A", "-..." to "B", "-.-." to "C", "-.." to "D", "." to "E", "..-." to "F", "-----" to "0",
    "--." to "G", ".----" to "1", "...." to "H", "..---" to "2", ".." to "I", "...--" to "3", ".---" to "J", "....-" to "4",
    "-.-" to "K", "....." to "5", ".-.." to "L", "-...." to "6", "--" to "M", "--..." to "7", "-." to "N", "---.." to "8",
    "---" to "O", "----." to "9", ".--." to "P", ".-.-.-" to ".", "--.-" to "Q", "--..--" to ",", ".-." to "R", "..--.." to "?",
    "..." to "S", "-....-" to "-", "-" to "T", ".----." to "\"", "..-" to "U", "---..." to ":", "...-" to "..-" to "U", "---..." to ":",
    "...-" to "V", ".-..-." to "'", ".--" to "W", "-..-." to "/", "-..-" to "X", ".--.-." to "@", "-.--" to "Y", "--.." to "Z")

fun decodeMorse(code: String) = code
    .split(" ").joinToString("") { MorseCode[it] ?: " " }
    .replace("\\s+".toRegex(), " ").trim()