package day71


fun travel(r: String, zipcode: String): String {
    val filter = """(\d+) (.*?) (\w{2} \d+),?"""
        .toRegex().findAll(r).filter { it.groupValues[3] == zipcode }
    val result = filter.map {
        listOf(it.groupValues[1], it.groupValues[2], it.groupValues[3])
    }.toList()
    val streets = (result.indices).joinToString(",") { result[it][1] }
    val numbers = (result.indices).joinToString(",") { result[it][0] }
    println(result)
    return "$zipcode:$streets/$numbers"
}