package day11

fun main() {
    print(mirror("tamaleS iraH initraK"))
}

fun mirror(text: String): String {
    val arr = text.split(" ").reversed().joinToString(" ").reversed().split(" ")
    val max = arr.maxBy { it.length }?.length ?: 0
    val result = mutableListOf<String>()

    result.add("*".repeat(max+4))
    for (i in 0 until arr.size){
        if(max == arr[i].length){
            result.add("* " + arr[i] + " ".repeat(1) + "*")
        } else {
            result.add("* " + arr[i] + " ".repeat(max+1 - arr[i].length) + "*")

        }
    }
    result.add("*".repeat(max+4))

    return result.joinToString("\n")
}