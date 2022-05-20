fun main() {
    // write your code here
    val (a, op, b) = readln().split(" ")

    val x: Long = a.toLong()
    val y: Long = b.toLong()

    val result = when (op) {
        "+" -> x + y
        "-" -> x - y
        "*" -> x * y
        "/" -> when (y) {
            0.toLong() -> "Division by 0!"
            else -> x / y
        }
        else -> "Unknown operator"
    }
    println(result)
}
