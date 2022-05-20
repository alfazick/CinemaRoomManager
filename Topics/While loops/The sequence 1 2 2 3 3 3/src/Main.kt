fun main() {
    // put your code here
    val limit = readln().toInt()

    var cnt = 0
    var num = 1

    while (cnt < limit) {
        val curLen = num
        repeat(curLen) {
            print("$curLen ")
            cnt += 1
            if (cnt == limit) {
                return
            }
        }
        num += 1
    }
}
