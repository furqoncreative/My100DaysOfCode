package day94

fun longestConsec(strarr: Array<String>, k: Int) =
   if (strarr.isEmpty().or(k <= 0).or(k > strarr.size)) ""
   else strarr.toList()
      .windowed(k)
      .map { it.joinToString("") }
      .maxBy { it.length } ?: ""