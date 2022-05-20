import kotlin.Exception        

fun calculateBrakingDistance(v1: String, a: String): Int {
    // write your code here
    try {
        val num = v1.toInt()
        return calculateMath(-1 * num * num / 2, a.toInt())
    } catch (e: ArithmeticException) {
        println("The car does not slow down!")
        return -1
    } catch (e: Exception) {
        println(e.message)
        return -1
    }

}

private fun calculateMath(x: Int, y: Int): Int {
    try {
        return x / y
    } catch (e: ArithmeticException) {
        throw e
    }
}
