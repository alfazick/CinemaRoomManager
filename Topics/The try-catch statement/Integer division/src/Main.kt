fun intDivision(x: String, y: String): Int {
    var result = 0
    try {
        val num1 = x.toInt()
        val num2 = y.toInt()
        result = num1 / num2
    } catch (e: NumberFormatException) {
        println("Read values are not integers.")
    } catch (e: ArithmeticException) {
        println("Exception: division by zero!")
    }
    return result
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}
