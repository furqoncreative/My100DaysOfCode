package day47

import java.lang.Long.toBinaryString
import kotlin.math.pow

fun numberAndIPaddress(s: String): String = if (s.contains(".")) toNumber(s) else toIP(s)

fun toNumber(s: String): String {
    var pow = 3
    return s.split(".").map {
        it.toInt()*256.0.pow(pow--).toLong()
    }.sum().toString()
}

fun toIP(ip: String): String = String
    .format("%32s", toBinaryString(ip.toLong()))
    .replace(" ".toRegex(), "0")
    .chunked(8)
    .map { Integer.parseInt(it, 2) }
    .joinToString(".")