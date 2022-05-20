 
class Pirate(name: String) {
    var name: String = name
        private set    
}
 
fun main() {
    var captain = Pirate("Hector Barbossa")
    println(captain.name)
    captain = Pirate("Jack Sparrow")
    println(captain.name)

}
