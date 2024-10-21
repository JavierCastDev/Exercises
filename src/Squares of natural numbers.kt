fun squareNaturalNumbers() {

    val input = readln().toInt()
    var count = 1

    while (true) {
        val currentSquare = count * count
        if (currentSquare > input) break
        println(currentSquare)
        count++
    }
}