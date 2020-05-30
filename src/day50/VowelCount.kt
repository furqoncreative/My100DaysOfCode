package day50

fun getCount(str : String) = str.filter { it in listOf('a','i','u','e', 'o') }.length