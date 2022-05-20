fun main() {
    // put your code here
    var num = readln().toInt()
    
    while (true) {
        val newNum = readln().toInt()
        if (newNum > num && newNum != 0) {
            num = newNum
        } 
        if (newNum == 0) {
            break
        }
    }
    println(num)
}
