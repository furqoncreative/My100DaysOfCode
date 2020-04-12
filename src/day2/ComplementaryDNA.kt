package day2

object ComplementaryDNA {
    fun makeComplement(dna : String) : String =
        dna.mapIndexed { _, c ->
            when(c){
                'A' -> 'T'
                'T' -> 'A'
                'G' -> 'C'
                'C' -> 'G'
                else -> throw IllegalArgumentException()
            }
        }.joinToString(separator = "")
}