package day32

fun bingo(ticket: Array<Pair<String, Int>>, win: Int): String {
    var minWin = 0
    ticket.forEach {
        val x = it.first.chunked(1).map {
            it.hashCode()
        }
        if (x.contains(it.second)) minWin++
    }

    return if (minWin>=win) "Winner!" else "Loser!"
}