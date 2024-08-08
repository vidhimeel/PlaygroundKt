package pattern

fun main() {
    val array = intArrayOf(4, 5,6,8,9)

    var minimumValue = 9
    for (currentValue in array){
        if (currentValue < minimumValue){
            minimumValue = currentValue
        }
    }
    println(minimumValue)
}
