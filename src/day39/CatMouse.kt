package day39

fun catMouse(s: String) = if (s.filter { it == '.' }.count() > 3) "Escaped!" else "Caught!"