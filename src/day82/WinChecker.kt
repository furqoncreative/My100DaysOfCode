package day82

fun winChecker(board: String): Boolean {
    board.also {
        when {
            it[0] == it[1] && it[0] == it[2] && it[0] != '-' -> return true
            it[0] == it[4] && it[0] == it[8] && it[0] != '-' -> return true
            it[0] == it[3] && it[0] == it[6] && it[0] != '-' -> return true
            it[1] == it[4] && it[1] == it[7] && it[1] != '-' -> return true
            it[2] == it[5] && it[2] == it[8] && it[2] != '-' -> return true
            it[2] == it[4] && it[2] == it[6] && it[2] != '-' -> return true
            it[3] == it[4] && it[3] == it[5] && it[3] != '-' -> return true
            it[6] == it[7] && it[6] == it[8] && it[6] != '-' -> return true
        }
    }
    return false
}