/*
“El problema no es el problema en sí. El problema es tu actitud ante el problema.
¿Lo entiendes?” – Jack Sparrow

Este código imprime el nombre del capitán actual del barco (ahora es el nombre de Héctor).

Sin embargo, la tripulación eligió un nuevo capitán, y ahora es Jack Sparrow.

Corrija la declaración de la captainvariable, cree un nuevo Pirateobjeto con el nombre de Jack Sparrow,
asigne un nuevo valor a la variable captaine imprima nuevamente el nombre del capitán actual.

Entrada de muestra 1:

Ejemplo de salida 1:

Hector Barbossa
Jack Sparrow*/


// you do not need to understand how it works, ignore it
data class Pirate(val name: String)

// Do not touch the lines above

fun main() {
    // fix the declaration below
    val captain = Pirate("Hector Barbossa")
    println(captain.name)
    // put your code here


}