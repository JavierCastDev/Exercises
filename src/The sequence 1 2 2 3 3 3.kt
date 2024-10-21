/*Escriba un programa que imprima una parte de la siguiente secuencia 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ...
(el número de repeticiones es igual al número respectivo). La entrada es un entero positivo n: el número
de elementos de la secuencia que el programa debe imprimir. La salida es la secuencia de números,
escrita en una sola línea, separada por espacios.

Por ejemplo, si n es 7, el programa debería generar 1 2 2 3 3 3 4(siete números).

Tenga en cuenta que un espacio al final de la línea de salida no afecta el resultado.
Preste atención a los números.*/

fun sequence() {

    val input = readln().toInt()
    var index = 1
    var count = 1

    while (index <= input) {
        if (count > input) {
            break
        }
        repeat(index) {
            if (count <= input) {
                print("$index ")
                count++
            }
        }
        index++
    }
}