fun main() {
    // write your code here
    val size = readln().toInt()
    val profit = mutableListOf<Int>()

    repeat(size) {
        profit.add(readln().toInt())
    }

    var taxPaid = 0.0
    var bestIdx = 0
    var idx = 0
    repeat(size) {
        val curTax = readln().toDouble() / 100 * profit[idx].toDouble()
        if (curTax > taxPaid) {
            taxPaid = curTax
            bestIdx = idx
        }
        idx++
    }

    println(bestIdx + 1)

}
