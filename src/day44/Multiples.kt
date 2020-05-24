package day44

fun solution(n: Int): Int {
    val x = mutableListOf<Int>()
    for (i in 1 until n){
        if (i%3==0 || i%5==0 && i!=n) x.add(i)
    }
    return x.sum()
}

//fun solution(number: Int) = (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()