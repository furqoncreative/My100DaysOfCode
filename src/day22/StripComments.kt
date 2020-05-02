package day22

fun solution(input: String, markers: CharArray): String {
    val arr:MutableList<String> = ArrayList()
    input.split("\n").forEach {
        var x = ""
        for (a in markers){
            if (it.contains(a)){
                x = it.substringBefore(a).dropLast(1)
                break
            } else x = it
        }
        arr.add(x)
    }
    return arr.joinToString("\n")
}