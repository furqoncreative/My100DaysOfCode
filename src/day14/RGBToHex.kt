package day14

fun rgb(r: Int, g: Int, b: Int): String {
    val arr = arrayOf(r,g,b)
    for(i in arr.indices){
        if (arr[i] < 0) arr[i] = 0
        else if (arr[i]  > 255) arr[i] = 255
        else arr[i]
    }
    return arr.joinToString(""){ String.format("%02X", it) }
}