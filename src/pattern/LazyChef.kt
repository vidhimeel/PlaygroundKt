package pattern

fun main() {
    val  t = readln().toInt()
    repeat(t){

        val input = readln().split(" ")
        val x = input[0].toInt()
        val m = input[1].toInt()
        val d = input[2].toInt()

        if (x * m > x + d){
            println(x+d)
        }else{
            println(x * m)
        }

    }
}