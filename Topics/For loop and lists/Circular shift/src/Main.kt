fun main() {
    // write your code here
    val size = readln().toInt()
    val nums = mutableListOf<Int>()

    repeat(size) {
        nums.add(readln().toInt())
    }

    val ans = nums.subList(size - 1, size) + nums.subList(0, size - 1)

    println(ans.joinToString(" "))
}
