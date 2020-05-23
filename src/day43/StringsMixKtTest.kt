package day43

import org.junit.Test

import org.junit.Assert.*

class StringsMixKtTest {

    @Test
    fun test() {
        println("Fixed Tests")
        assertEquals("2:eeeee/2:yy/=:hh/=:rr", mix("Are they here", "yes, they are here"))
        assertEquals("1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg",
            mix("looping is fun but dangerous", "less dangerous than coding"))
        assertEquals("1:ffff/2:ppp/2:sss/1:qq/1:rr/1:tt/1:ww/2:hh/2:kk/2:uu/=:oo",
            mix("EqwbfEodsqGrwzfWlemfJtirgXotkf", "GkesvWpuloBpnkqXshhpUuozaUxfds"))
        assertEquals("=:aaaaa/1:iii/2:nnn/1:ll/1:rr/1:tt/2:hh/2:oo",
            mix("Selamat Hari Raya Idul Fitri", "Mohon Maaf Lahir dan Batin"))

    }
}