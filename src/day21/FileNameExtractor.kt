package day21

object FileNameExtractor {
    fun extractFileName(dirtyFileName: String): String {
        return dirtyFileName
            .replace("[0-9]+_".toRegex(),"")
            .split(".")
            .slice(0..1)
            .joinToString(".")
    }
}