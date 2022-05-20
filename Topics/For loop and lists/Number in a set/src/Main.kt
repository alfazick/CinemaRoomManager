fun main() {
    // write your code here
    val size = readln().toInt()
    val lst = mutableListOf<Int>()

    repeat(size) {
        lst.add(readln().toInt())
    }

    val target = readln().toInt()

    println(if (lst.contains(target)) "YES" else "NO")
}
