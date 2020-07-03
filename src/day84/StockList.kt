package day84

object StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
        val artGroup = lstOfArt.groupBy(
            { it[0].toString() },
            { it.split(" ")[1].toInt() }
        )
        return if (lstOfArt.isEmpty() || lstOfCat.isEmpty()) ""
        else lstOfCat.joinToString(" - ") { "($it : ${artGroup[it]?.sum() ?: 0})" }
    }
}