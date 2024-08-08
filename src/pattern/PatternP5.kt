package pattern

fun main() {
    val rows = 3

    for (i in 1..rows) {
        for (space in 2..i) {
            print(" ")
        }
        print("*")

        for (space in (rows-1) downTo i) {
            print(" ")
        }
        print("+")

        for (space in (rows-1) downTo i) {
            print(" ")
        }
        print("*")
        println()
    }

    for (star in 1..(2 * rows +1)){
        print("*")
    }
    println()

    for (i in rows downTo 1) {
        for (space in 2..i) {
            print(" ")
        }
        print("*")

        for (space in (rows-1) downTo i) {
            print(" ")
        }
        print("+")


        for (space in (rows-1) downTo i) {
            print(" ")
        }
        print("*")
        println()
    }
}