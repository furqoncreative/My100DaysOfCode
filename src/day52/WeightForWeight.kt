package day52

fun orderWeight(string:String)=string
    .split(' ').sorted().sortedBy { it.chunked(1).map { it.toInt() }.sum() }.joinToString(" ")

