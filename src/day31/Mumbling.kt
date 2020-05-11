package day31

fun accum(s:String):String {
    return s.toLowerCase().mapIndexed{i,c->
        c.toString()
            .repeat(i+1)
            .capitalize()
    }.joinToString("-")
}