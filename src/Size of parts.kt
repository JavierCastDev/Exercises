/*
Un dispositivo de detección compara el tamaño de los componentes producidos por una máquina
con el componente de referencia.

Si el tamaño del componente es mayor , se puede reparar; el detector imprime 1.
Si el tamaño del componente es menor , se considera un rechazo; el detector imprime -1.
Si el componente es perfecto , se envía a la caja; el detector imprime 0.

Escriba un programa que tome n(la cantidad de piezas) como entrada y luego la secuencia del detector.
El programa debe generar tres números en una sola línea: la cantidad de componentes perfectos, la
cantidad de componentes más grandes y la cantidad de componentes rechazados.*/

fun parts() {
    //Code here
    val totalPiezas = readln().toInt()
    val listaPiezas = mutableListOf<Int>()
    repeat(totalPiezas) {
        val pieza = readln().toInt()
        if (pieza > 1 || pieza < -1) {
            println("Ingrese un valor dentro del rango correcto")
        } else {
            listaPiezas.add(pieza)
        }
    }

    var larger = 0
    var smaller = 0
    var perfect = 0

    for (i in listaPiezas) {
        when(i) {
            1 -> larger++
            -1 -> smaller++
            0 -> perfect++
        }
    }

    println("$perfect $larger $smaller")
}