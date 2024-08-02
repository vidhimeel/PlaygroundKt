package pattern

fun main() {
    val rows = 5

    for (i in rows downTo 1) {
        for (space in 0..rows - i) {
            print("*")
        }

        println("----")
    }
}
