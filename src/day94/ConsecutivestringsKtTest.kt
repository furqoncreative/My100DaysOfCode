package day94

import org.junit.Test

import org.junit.Assert.*

class ConsecutivestringsKtTest {

    @Test
    fun test() {
        println("longestConsec Fixed Tests")
        testing(
            longestConsec(
                arrayOf<String>(
                    "zone",
                    "abigail",
                    "theta",
                    "form",
                    "libe",
                    "zas",
                    "theta",
                    "abigail"
                ), 2
            ), "abigailtheta"
        )
        testing(
            longestConsec(
                arrayOf<String>(
                    "red",
                    "orange",
                    "yellow",
                    "green",
                    "blue",
                    "indigo",
                    "violet"
                ), 2
            ), "orangeyellow"
        )
        testing(
            longestConsec(
                arrayOf<String>(
                    "ejjjjmmtthh",
                    "zxxuueeg",
                    "aanlljrrrxx",
                    "dqqqaaabbb",
                    "oocccffuucccjjjkkkjyyyeehh"
                ), 1
            ), "oocccffuucccjjjkkkjyyyeehh"
        )
        testing(
            longestConsec(
                arrayOf<String>(
                    "wlwsasphmxx",
                    "owiaxujylentrklctozmymu",
                    "wpgozvxxiu"
                ), 2
            ), "wlwsasphmxxowiaxujylentrklctozmymu"
        )

    }
    companion object {
        private fun testing(actual:String, expected:String) {
            assertEquals(expected, actual)
        }
    }
}