package pattern

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()

        val s = readln()

        println(isEasyPronunciation(s))

    }
}


fun isEasyPronunciation(word: String): String {
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    var consecutiveConsonants = 0

    for (char in word) {
        if (char !in vowels) {
            consecutiveConsonants++
            if (consecutiveConsonants == 4)
                return "No"
        } else {
            consecutiveConsonants = 0
        }
    }
    return "Yes"
}






