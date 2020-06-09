package day60

object DirReduction {
    fun dirReduc(arr: Array<String>): Array<String> {
        val result = mutableListOf<String>()
        val oppositeDir = mapOf(
            "WEST" to "EAST", "EAST" to "WEST",
            "SOUTH" to "NORTH", "NORTH" to "SOUTH"
        )
        arr.forEach {
            when {
                result.isEmpty() -> result.add(it)
                result[result.lastIndex] == oppositeDir[it] -> result.removeAt(result.lastIndex)
                else -> result.add(it)
            }
        }
        return if (arr.size <= 1) arr else result.toTypedArray()
    }
}