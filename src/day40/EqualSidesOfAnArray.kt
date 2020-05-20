package day40


object EqualSidesOfAnArray {
    fun findEvenIndex(arr:IntArray):Int {
        arr.forEachIndexed { i, _ ->
            if (arr.take(i).sum() == arr.drop(i+1).sum()) return i
        }
        return -1
    }
}