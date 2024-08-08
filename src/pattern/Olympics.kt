package pattern

fun main() {
    val input = readln().split(" ")
    val g = input[0].toInt()
    val s = input[1].toInt()
    val b = input[2].toInt()
    var rm = 0

    if (g < 5){
        rm = rm + 5 - g
    }
    if (s < 5){
        rm = rm + 5 - s
    }
    if (b < 5){
        rm = rm + 5 - b
    }
    print(rm)
}