package day70

fun catalog(s: String, article: String): String {
    val list: MutableList<String> = mutableListOf()
    s.split("\n\n").forEach {
        val name = it.substringAfter("<name>", "").substringBefore("</name>")
        val prx = it.substringAfter("<prx>", "").substringBefore("</prx>")
        val qty = it.substringAfter("<qty>", "").substringBefore("</qty>")
        list.add("$name > prx: \$$prx qty: $qty")
    }
    val result = list.filterIndexed { i, _ -> list[i].contains(article) }
    return if (result.isNotEmpty()) result.joinToString("\n") else "Nothing"
}