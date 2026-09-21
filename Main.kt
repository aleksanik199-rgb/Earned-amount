package first_project

fun main() {
    val amount = mapOf("Bubblegum" to 202, "Toffee" to 118, "Ice cream" to 2250, "Milk chocolate" to 1680, "Doughnut" to 1075, "Pancake" to 80)
    println("Earned amount:")
    for ((key, value) in amount) {
        println("$key: $$value")

    }
    println()
    val income = amount.values.sum()
    println("Income: $$income")

    print("Staff expenses: ")
    val staffExpenses = readln().toInt()
    print("Other expenses: ")
    val otherExpenses = readln().toInt()
    val netIncome = income - (staffExpenses + otherExpenses)
    println("Net income: $$netIncome")
}