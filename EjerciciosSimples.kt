fun main() {
    //exerciseOne()
    //exerciseTwo()
    //exerciseThree()
    //exerciseFour()
    //exerciseFive()
    //exerciseSix()
}

private fun exerciseOne(){
    //Escriba un programa que calcule el promedio de 4 notas ingresadas por el usuario

    var result = 0
    for(i in 1..4){
        print("Ingresa una nota: ")
        val note = readln()
        result += note.toInt()
    }
    println("El promedio es ${result / 4}")
}

private fun exerciseTwo(){
    //Escriba un programa que convierta de centímetros a pulgadas.
    //Una pulgada es igual a 2.54 centímetros.

    //De cm a pulgadas
    print("Ingrese longitud: ")
    val cm = readln()
    println("$cm cm son ${cm.toDouble() / 2.54} pulgadas")

    //De pulgadas a cm
    print("Ingrese longitud: ")
    val pgd = readln()
    println("$pgd pulgadas son ${pgd.toDouble() * 2.54} cm")
}

private fun exerciseThree(){
    //Escriba un programa que pida al usuario un entero de tres dígitos,
    //y entregue el número con los dígitos en orden inverso:

    //Option 1
    print("Ingrese un numero de tres digitos: ")
    val numbs = readln()
    println(numbs.reversed())

    //Option 2
    print("Ingrese un numero de tres digitos: ")
    val numbsTwo = readln()
    var result = ""
    for(i in numbsTwo.length - 1 downTo 0){
        result += numbsTwo[i]
    }
    println(result)
}

private fun exerciseFour(){
    //Escriba un programa que reciba como entrada el radio de
    //un círculo y entregue como salida su perímetro y su área:

    print("Introduce el radio: ")
    val radio = readln()
    println("Perimetro de la circunferencia: ${3.14 * 2 * radio.toInt()}")
    println("Area de la circunferencia: ${3.14 * radio.toInt()*radio.toInt()}")
}

private fun exerciseFive(){
    //Escriba un programa que pregunte al usuario la hora actual t del reloj y
    //un número entero de horas h, que indique qué hora marcará el reloj dentro
    //de h horas:

    print("Hora actual: ")
    var hour = readln().toInt()
    print("Cantidad de horas: ")
    val quantityHours = readln()
    for(i in 1..quantityHours.toInt()){
        if(hour > 12) hour = 1
        hour += 1
    }
    println("En $quantityHours horas, el reloj marcara las $hour")
}

private fun exerciseSix(){
    //Escriba un programa que entregue la parte decimal
    //de un número real ingresado por el usuario.

    print("Ingrese un numero: ")
    val numb = readln()
    val result = numb.toDouble() - numb.substringBefore(".").toInt()
    println("La parte decimal del numero $numb es $result")
}

