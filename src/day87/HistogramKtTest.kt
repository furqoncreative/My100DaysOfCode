package day87

import org.junit.Test

import org.junit.Assert.*

class HistogramKtTest {

    @Test
    fun test() {
        assertCorrect("tpwaemuqxdmwqbqrjbeosjnejqorxdozsxnrgpgqkeihqwybzyymqeazfkyiucesxwutgszbenzvgxibxrlvmzihcb",
            "u  3     ***\rw  4     ****\rx  6     ******\rz  6     ******")
        assertCorrect("aaifzlnderpeurcuqjqeywdq","u  2     **\rw  1     *\rz  1     *")
        assertCorrect("sjeneccyhrcpfvpujfaoaykqllteovskclebmzjeqepilxygdmzvdfmxbqdzubkzturnuqxsewrwgmdfwgdx",
            "u  4     ****\rw  3     ***\rx  4     ****\rz  4     ****")
        assertCorrect("bnxyytdtqrkeaswymiwbxnuydwthweyzny","u  1     *\rw  4     ****\rx  2     **\rz  1     *")
        assertCorrect("ttopvdaxgwfpzjmomkwssytktaizqtsekfmfhrabidwaugioqyyzrxbugsusxkfdevmijqyprcoxfyjqwsutoutjgozyhsoytg",
            "u  5     *****\rw  4     ****\rx  4     ****\rz  4     ****")
    }

    private fun assertCorrect(input: String, expected: String) {
        assertEquals(expected, hist(input))
    }
}