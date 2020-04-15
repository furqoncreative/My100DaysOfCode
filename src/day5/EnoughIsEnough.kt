package day5

object EnoughIsEnough {
    fun deleteNth(arr:IntArray, n:Int):IntArray {
        val count = mutableMapOf<Int, Int>()
        val result = mutableListOf<Int>()

        arr.forEach {
            count[it] = if (count[it] == null)  1 else  count[it]!! + 1

            if (count[it]!! <= n) {
                result.add(it)
            }
        }

        return result.toIntArray()
    }
}