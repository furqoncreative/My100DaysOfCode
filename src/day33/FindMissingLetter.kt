package day33

fun findMissingLetter(array: CharArray): Char {
    for (i in 0 until array.size-1){
        if (array[i+1] - array[i] != 1) return (array[i].hashCode()+1).toChar()
    }
    return Char.MIN_VALUE
}