package day46

fun unless(value: Boolean, unit: () -> Unit) = if (!value) unit() else null

fun until(value: () -> Boolean, unit: () -> Unit) {
    while (!value()) unit()
}

fun forceRun(unit: () -> Unit) {
    try { unit()
    } catch (e: Exception) {}
}