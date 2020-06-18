package day69


fun blackOrWhiteKey(keyPressCount: Int): String {
    return when ((keyPressCount - 1) % 88 % 12) {
        0, 2, 3, 5, 7, 8, 10 -> "white"
        else -> "black"
    }
}