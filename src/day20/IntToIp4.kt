package day20

fun longToIP(ip: UInt): String = String
        .format("%32s", Integer.toBinaryString(ip.toInt()))
        .replace(" ".toRegex(), "0")
        .chunked(8)
        .map { Integer.parseInt(it, 2) }
        .joinToString(".")
