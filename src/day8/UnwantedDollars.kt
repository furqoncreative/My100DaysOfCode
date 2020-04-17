package day8

object UnwantedDollars {
    fun moneyValue(money:String):Double {
        return  if ("[1-9]".toRegex().containsMatchIn(money) ) money.split("$" , " ").toTypedArray().joinToString("").toDouble() else 0.0
    }
}