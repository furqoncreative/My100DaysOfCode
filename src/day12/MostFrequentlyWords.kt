package day12

fun top3(s: String): List<String> {
    val map = mutableMapOf<String, Int>()
    val str = ("[^A-Za-z' ]").toRegex().replace(s," ")

    val list = str.toLowerCase().split(" ").forEach { str ->
        if (str.contains(Regex("[a-z]"))){
            if (map.keys.contains(str)){
                map[str] = map.get(str)!!.plus(1)
            }else{
                map[str] = 1
            }
        }
    }

    return map.toList().sortedByDescending { (_, value) -> value }.take(3).map { it.first }
}