package day7

fun main(){
    print(FindTheParity.find(arrayOf(2,-3,0)))
}
object FindTheParity{
    fun find(integers: Array<Int>): Int {
        return  if((integers.count{ it % 2 == 0}) > 1) integers.find { it % 2 != 0 }!!
        else if((integers.count{ it % 2 == 1}) > 1) integers.find { it % 2 == 0 }!!
        else 0
    }
}
