package day53

import org.junit.Test

import org.junit.Assert.*

class MatchSubstTest {

    private fun dotest(s: String, prog: String, version: String, exp: String) {
        val ans = MatchSubst.change(s, prog, version)
        assertEquals(exp, ans)
    }
    @Test
    fun test() {
        println("Basic Tests")
        val s1 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha"
        dotest(s1, "Ladder", "1.1", "Program: Ladder Author: g964 Phone: +1-503-555-0090 Date: 2019-01-01 Version: 1.1")

        val s2 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 2.0\nLevel: Alpha"
        dotest(s2, "Ladder", "1.1", "Program: Ladder Author: g964 Phone: +1-503-555-0090 Date: 2019-01-01 Version: 2.0")

        val s3 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7.5\nLevel: Alpha"
        dotest(s3, "Ladder", "1.1", "ERROR: VERSION or PHONE")

        val s4 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: .2\nLevel: Alpha"
        dotest(s4, "Ladder", "1.1", "ERROR: VERSION or PHONE")

        val s5 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-009i\nDate: Tues April 9, 2005\nVersion: .2\nLevel: Alpha"
        dotest(s5, "Ladder", "1.1", "ERROR: VERSION or PHONE")

    }
}