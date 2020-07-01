package day82

import org.junit.Test

import org.junit.Assert.*

class WinCheckerKtTest {

    @Test
    fun someBoardsWithWinnersTests () {
        val winners = arrayOf("XXX-O-O-O", "X--OOOX-X", "O--OO-XXX", "O-XOX-O-X", "OXOOXOXX-", "X-O-OOXXO", "XO--X-OOX", "X-OXOOOXX")
        winners.forEach { winner ->
            println("Testing with board " + winner)
            assertEquals(true, winChecker(winner))
        }
    }

    @Test
    fun someBoardsWithoutWinnersTests () {
        val notWinners = arrayOf("XO-------", "XX-XOO---", "-XX-OO-O-", "OXO--XXO-", "OOXXXO---", "OXXX-XOO-", "OOXXX----", "XXOOXXOO-", "OXOXOX---")
        notWinners.forEach { notWinner ->
            println("Testing with board " + notWinner)
            assertEquals(false, winChecker(notWinner))
        }
    }
}