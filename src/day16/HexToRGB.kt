package day16

data class RGB(val r: Int, val g: Int, val b: Int)
fun hexStringToRGB(str: String): RGB {
    val dec = str.substring(1).chunked(2).map{ it.toInt(16) }
    return RGB(dec[0], dec[1], dec[2])
}