package pattern

fun main() {
    val rows = 5
    var k = 0

    for (i in rows downTo 1) {
        for (space in 0..rows - i) {
            print("*")
        }

        print("----")

        while (k != 2 * i) {
            print("*")
            ++k
        }

        for (j in rows downTo  1){
            print("-")
        }
        for (space in 0..rows - i) {
            print("*")
        }
        k = 0
        println()

    }
}
