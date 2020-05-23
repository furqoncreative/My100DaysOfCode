package day43

fun mix(s1: String, s2: String): String {
    val m1 = mutableMapOf<Char, Int>()
    val m2 = mutableMapOf<Char, Int>()
    val mix = mutableMapOf<String, Char>()

    cluster(s1, m1)
    cluster(s2, m2)

    for (i in m1.filter { it.value>1 }.keys+m2.filter { it.value>1 }.keys){
        when {
            m1[i]?:0 == m2[i]?:0 -> mix[i.toString().repeat(m1[i]!!)] = '='
            m1[i]?:0 > m2[i]?:0 -> mix[i.toString().repeat(m1[i]!!)] = '1'
            else -> mix[i.toString().repeat(m2[i]!!)] = '2'
        }
    }

    return mix.toSortedMap().toList()
        .sortedBy { it.second }
        .sortedByDescending { it.first.length }
        .joinToString("/") { it.second + ":" + it.first }
}

fun cluster(s: String, m:MutableMap<Char, Int>) =  "[^a-z]".toRegex().replace(s, "")
    .forEach { c -> if (m.keys.contains(c)) m[c]= m[c]!!.plus(1) else m[c] = 1 }