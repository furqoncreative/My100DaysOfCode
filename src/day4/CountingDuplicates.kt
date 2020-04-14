package day4

fun duplicateCount(text: String): Int {
    val list: MutableList<Char> = ArrayList()
    val arr = text.toLowerCase().toCharArray()

    for (i in 0 until text.length) {
        for (j in i + 1 until text.length) {
            if (arr[i] == arr[j]) {
                if(!list.contains(arr[j])){
                    list.add(arr[j])
                }
                break
            }
        }
    }

    return list.count()
}
