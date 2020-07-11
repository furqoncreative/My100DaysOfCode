package day92

object DNADecomposer {
    fun decomposeDoubleStrand(doubleStrand: String): String {
        val str = StringBuilder()
        for (i in 1..3) {
            if (i == 1) str.append("Frame $i: ${doubleStrand.chunked(3).joinToString(" ")}") else {
                str.append("\nFrame $i: ${doubleStrand.take(i - 1).toList().joinToString("")}")
                str.append(doubleStrand.takeLast(doubleStrand.length - (i - 1)).chunked(3).joinToString(" ", " "))
            }
        }
        str.append("\n\n")
        for (i in 1..3) {
            val reverse = makeComplement(doubleStrand).reversed()
            if (i == 1) str.append("Reverse Frame $i: ${reverse.chunked(3).joinToString(" ")}") else {
                str.append("\nReverse Frame $i: ${reverse.take(i - 1).toList().joinToString("")}")
                str.append(reverse.takeLast(reverse.length - (i - 1)).chunked(3).joinToString(" ", " "))
            }
        }
        return str.toString()
    }

    fun makeComplement(dna: String): String {
        val map = mapOf('T' to 'A', 'A' to 'T', 'C' to 'G', 'G' to 'C')
        return dna.toCharArray().joinToString("") { map[it].toString() }
    }
}