package day76

import org.junit.Test

import org.junit.Assert.*

class WhichAreInKtTest {

    @Test
    fun testFixed() {
        var a2 = arrayOf<String>("lively", "alive", "harp", "sharp", "armstrong")
        assertArrayEquals(arrayOf<String>("live", "strong"), inArray(arrayOf<String>("xyz", "live", "strong"), a2))
        assertArrayEquals(arrayOf<String>("arp", "live", "strong"), inArray(arrayOf<String>("live", "strong", "arp"), a2))
        assertArrayEquals(arrayOf<String>(), inArray(arrayOf<String>("tarp", "mice", "bull"), a2))
        a2 = arrayOf("lively", "alive", "harp", "sharp", "armstrong")
        assertArrayEquals(arrayOf<String>(), inArray(arrayOf<String>("live", "strong", "lyal", "lysh", "arp"), a2))
    }
}