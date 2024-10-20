/*
Un coche ganador

Imagina que estás eligiendo un coche para una carrera. La velocidad máxima de tu coche debe ser de al menos 120 km/h y el tiempo de aceleración hasta alcanzar la velocidad máxima no debe superar los cuatro segundos . El tiempo de aceleración no puede ser inferior a un segundo.

Si se viola una de estas condiciones, se debe lanzar una excepción con el mensaje The race can't be won with this car; de lo contrario, devolver I will definitely win!.

Escribe una función que te ayude a elegir un coche.
*/

fun findCar(): String {
    val maxSpeed = readln().toInt()
    val accTime = readln().toInt()

    val comprobar = if (maxSpeed > 119) {

        if(accTime in 1..4){
            "I will definitely win!"
        } else {
            throw error("The race can't be won with this car")
        }
    } else {
        throw error("The race can't be won with this car")
    }
    return comprobar
}