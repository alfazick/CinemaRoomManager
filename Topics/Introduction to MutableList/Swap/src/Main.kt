fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.

    val start = 0
    val end = numbers.lastIndex
    val tmp = numbers[end]
    numbers[end] = numbers[start]
    numbers[start] = tmp

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}
