fun sumElements() {
    val list = mutableListOf<Int>()
    var number = 1

    while (number != 0) {
        number = readln().toInt()
        list.add(number)
    }
    println(list.sum())
}