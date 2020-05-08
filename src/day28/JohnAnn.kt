package day28


fun john(n: Long): List<Long> {
    val johns = mutableListOf<Long>(0)
    val anns = mutableListOf<Long>(1)
    for (i in 1 until n.toInt()) {
        johns.add(i - anns[johns[(i - 1)].toInt()])
        anns.add(i - johns[anns[(i - 1)].toInt()])
    }
    return johns
}

fun ann(n: Long): List<Long> {
    val johns = mutableListOf<Long>(0)
    val anns = mutableListOf<Long>(1)
    for (i in 1 until n.toInt()) {
        johns.add(i - anns[johns[(i - 1)].toInt()])
        anns.add(i - johns[anns[(i - 1)].toInt()])
    }
    return anns
}

fun sumJohn(n: Long): Long = john(n).sum()
fun sumAnn(n: Long): Long = ann(n).sum()



