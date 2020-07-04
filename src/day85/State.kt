package day85

object State {
    val states = mapOf(
        "AZ" to "Arizona",
        "CA" to "California",
        "ID" to "Idaho",
        "IN" to "Indiana",
        "MA" to "Massachusetts",
        "OK" to "Oklahoma",
        "PA" to "Pennsylvania",
        "VA" to "Virginia"
    )

    fun byState(str: String): String {
        val statesGroup = str.split("\n").groupBy(
            { states[it.takeLast(2)] },
            { it }
        )
        return statesGroup.map {
            "${it.key}" + it.value.sorted().joinToString(
                "\n..... ",
                "\n..... "
            ) { "${it.split(',').joinToString("").dropLast(2)}${states[it.takeLast(2)]}" }
        }.sorted().joinToString("\n ")
    }
}