package day76

fun inArray(array1: Array<String>, array2: Array<String>) =
    array1.filter { it in array2.joinToString() }.toSortedSet().toTypedArray()