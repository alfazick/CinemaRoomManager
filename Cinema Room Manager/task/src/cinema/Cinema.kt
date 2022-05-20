package cinema

import kotlin.math.ceil


fun printCinema(mat: List<List<Int>>) {
    println("Cinema:")
    for (row in mat.indices) {
        for (col in 0 until mat[0].size) {

            if (row == 0 && col == 0) {
                print("  ")
                continue
            }

            if (row == 0 || col == 0) {
                val num = if (row == 0) col else row
                print("$num ")

            } else {
                print(if (mat[row][col] == 0) "S " else "B ")
            }
        }
        println()

    }
}

fun calculatePrice(row: Int, capacityRow: Int, capacityCol: Int) : Int {
    val totalSeats = capacityRow*capacityCol
    var total = 10

    if (totalSeats > 61) {
        val discountedRows = ceil((capacityRow.toDouble()/2.0))

        if (row >= discountedRows){
            total -= 2

        }
    }
    return total
    }


fun reserveTicket(grid: List<List<Int>>): Array<Int>{
    // reserve a ticket
    println("Enter a row number:")
    val reservedRow = readln().toInt()
    println("Enter a seat number in that row:")
    val reservedCol = readln().toInt()

    if (reservedRow >= grid.size || reservedCol>= grid[0].size){
        println("Wrong input")
        return reserveTicket(grid)
    }

    if (grid[reservedRow][reservedCol] == 1){
        println("That ticket has already been purchased!")
        return reserveTicket(grid)
    }

    val ticketCost = calculatePrice(reservedRow, grid.size, grid[0].size)
    println("Ticket price: \$$ticketCost")

    return arrayOf(reservedRow,reservedCol,ticketCost)

}

fun printMenu() {
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
}

fun showStatistics(ticketsSold: Int, curIncome: Int, totalIncome: Int, totalTickets: Int) {
    val percentage = (ticketsSold.toDouble() / totalTickets.toDouble()) * 100
    println("Number of purchased tickets: $ticketsSold")
    println("Percentage: ${"%.2f".format(percentage)}%")
    println("Current income: $$curIncome")
    println("Total income: $$totalIncome")
}


fun precalculateGrid(grid: List<List<Int>>): Array<Int>{
    var totalSeats = 0
    var money = 0

    for (row in grid.indices) {
        for (col in 0 until grid[0].size) {
            if (row == 0 || col == 0){
                continue
            }
            totalSeats += 1
            money += calculatePrice(row, grid.size, grid[0].size)
        }
    }

    return arrayOf(totalSeats,money)
}


fun main() {

// create cinema
    println("Enter the number of rows:")
    val r = readln().toInt()
    println("Enter the number of seats in each row:")
    val c = readln().toInt()
    val grid = MutableList(r+1) { MutableList(c+1) {0} }

    var isOn = true
    val ans = precalculateGrid(grid)
    val totalTickets = ans[0]
    val totalIncome = ans[1]
    var soldTickets = 0
    var currentIncome = 0

    while (isOn) {
        printMenu()
        when(readln().toInt()) {
            1 -> {
                printCinema(grid)
        }
            2 -> {
            // reserve ticket
            val res = reserveTicket(grid)
            grid[res[0]][res[1]] = 1
            soldTickets += 1
            currentIncome += res[2]
        }
            3 -> {
                showStatistics(soldTickets,currentIncome,totalIncome,totalTickets)
            }

            0 -> {
                isOn = false
        }
        }


    }

}
