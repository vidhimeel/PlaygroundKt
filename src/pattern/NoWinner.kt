package pattern

import kotlin.math.abs
import kotlin.math.absoluteValue

fun main() {
    val t = readln().toInt()
    repeat(t) {

        val input = readln().split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()
        val c = input[2].toInt()
        val m = input[3].toInt()

        val ab = abs(a - b)
        val bc = abs(b - c)
        val ac = abs(a - c)

        if (ab <= m|| bc <= m || ac <= m){
            println("Yes")
        }else{
            println("No")
        }
    }
    println()
}
