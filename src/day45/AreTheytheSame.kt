package day45

fun comp(a: IntArray?, b: IntArray?): Boolean {
    if (a != null && b != null) {
        a.sort();b.sort()
        for (i in a.indices){ if (a[i]*a[i] != b[i] ) return false }
    } else return false
    return true
}
