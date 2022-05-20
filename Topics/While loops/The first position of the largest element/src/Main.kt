import java.util.*

fun main() {
    var curMax = readln().toInt()
    var bestPos = 1
    var idx = 1
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        idx += 1

        val next = scanner.next().toInt()
        if (next > curMax) {
            bestPos = idx
            curMax = next
        }
    }

    println("$curMax $bestPos")
}
