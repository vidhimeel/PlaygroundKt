package pattern

fun main() {
   val array = intArrayOf(1 , 2, 5, 7, 9)

    var maximum = 0
    for (currentValue in array){
        if (currentValue > maximum){
            maximum = currentValue
        }
    }
    println(maximum)
}