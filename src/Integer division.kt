/* You need to write a program that reads two values and prints the integer division.
To divide, there is a special function called intDivision.

In the input, it accepts two values of the type String and returns a value of the type Int.
In case of successful conversion to Int, the function intDivision returns the result of dividing
the first input parameter by the second. If the division fails, the default value 0 (zero) should
be returned.

If an arithmetic exception occurs when dividing by 0, it shall return the message
Exception: division by zero!. If it cannot convert the input parameters to the Int type, print Read
values are not integers.

Use the try/catch statement. */


fun intDivision(x: String, y: String): Int {
    return try {
        val numberOne = x.toInt()
        val numberTwo = y.toInt()

        if (numberTwo==0) {
            throw ArithmeticException("division by zero")
        } else {
            numberOne / numberTwo
        }
    } catch (e: NumberFormatException) {
        println("Read values are not integers.")
        0
    } catch (e: ArithmeticException) {
        println("Exception: division by zero!")
        0
    }
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}