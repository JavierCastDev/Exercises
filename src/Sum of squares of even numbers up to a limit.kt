/*Escriba un programa en Kotlin que muestre la suma de los cuadrados de números pares
desde 1 hasta un límite determinado. Tome el límite como una entrada entera del usuario.
Si el límite es menor que 0, imprima 'Entrada no válida'.*/

import java.util.Scanner

fun square() {
    // Create a Scanner object for taking input
    val reader = Scanner(System.`in`)

    // Read an integer input
    val limit = reader.nextInt()

    // Check if limit is less than 0
    if (limit < 0) {
        println("Invalid Input")
    } else {
        // Write a loop here to calculate the sum of squares of even numbers up to the limit
        // Use the 'repeat' construct
        // After calculating the sum, print it
        var number = 0
        var sum = 0
        repeat(limit){
            number++
            if (number <= limit && number%2 == 0) {
                val square = number * number
                sum += square
            }
        }
        println(sum)
    }
}