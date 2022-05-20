fun main() {  
    val beyondTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()   
    // do not touch the lines above
    // write your code here

    var beyound = true

    for (b in beyondTheWall) {
        if (b !in backToTheWall) {
            beyound = false
        }
    }
    
    println(beyound)

}
