package day27

fun dblLinear(n:Int):Int {
    val u = sortedSetOf(1)
    for (i in 1..n){
        val x  = u.first()
        u.add(2*x+1);u.add(3*x+1);u.remove(x)
    }
    return u.first()
}