fun main() {
    // put your code here
    var n = readln().toInt()
    if (n == 1) {
        println(n)
        return
    }

    do {
        print("$n ")
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = n * 3 + 1
        }
    } while (n != 1)

    println(n)
}
