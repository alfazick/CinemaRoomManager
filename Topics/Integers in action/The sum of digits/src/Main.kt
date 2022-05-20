fun main() {
    var num = readln().toInt()
    var total = 0

    while (num > 0) {
        total += num % 10
        num = num / 10
    }

    println(total)
}