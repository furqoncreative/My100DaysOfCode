package day6

object PlayPass {
    fun playPass(s: String, n: Int): String {
        val list = mutableListOf<Any>()

        s.toUpperCase().forEachIndexed { i, c ->
            if (c.isDigit())
                list.add(9 - c.toString().toInt())
            else if (c.isLetter()) {
                var x = c + n
                if (x in 'A'..'Z') {
                    list.add(x)
                } else {
                    list.add(('@' + (x - 'Z')))
                }
            } else list.add(c)
        }

        return list.mapIndexed { i, c ->
            if (i % 2 != 0) c.toString().toLowerCase() else c
        }.reversed().joinToString("")
    }
}