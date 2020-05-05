package day25

import java.math.BigInteger

object SumFct {
    fun perimeter(n: Int): BigInteger {
        val fibo = arrayListOf<BigInteger>()
        1.rangeTo(n+1).forEach{
            if (it<=2) fibo.add(BigInteger("1"))
            else fibo.add(fibo[it-3] + fibo[it-2])
        }
        return fibo.fold(BigInteger.ZERO, BigInteger::add).times(BigInteger("4"))
    }
}