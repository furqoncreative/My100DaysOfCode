package day53

object MatchSubst {
    fun change(s: String, prog: String, version: String): String {
        val result = s.split("\n")
        return if (!validation(s)) {
            return "ERROR: VERSION or PHONE"
        } else {
            result.joinToString(" ") {
                when {
                    it.contains("Program") -> it.replace(it, "Program: $prog")
                    it.contains("Author") -> it.replaceAfter(':', " g964")
                    it.contains("Phone") -> it.replaceAfter(':', " +1-503-555-0090")
                    it.contains("Date") -> it.replaceAfter(':', " 2019-01-01")
                    it.contains("Version") -> {
                        if (it.split(':')[1].toDouble() == 2.0) it
                        else it.replaceAfter(":", " $version")
                    }
                    else -> ""
                }
            }.replace("  "," ").trim()
        }
    }

    fun validation (s: String):Boolean{
        return Regex("Phone: (\\+1-\\d{3}-\\d{3}-\\d{4})").find(s)?.groupValues?.get(1) != null &&
                Regex("Version: (\\d+\\.\\d+)\n").find(s)?.groupValues?.get(1) != null
    }
}

