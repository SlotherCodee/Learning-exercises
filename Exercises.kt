import android.media.VolumeShaper.Operation

//Ejercicios de programación básica

fun main(){
    //exerciseOne()
    //exerciseTwo()
    //exerciseThree()
    //exerciseFour()
    //exerciseFive()
    //exerciseSix()
    //exerciseSeven()
    //exerciseEight()
}

private fun exerciseOne(){
    //Calcular el máximo de	un array de	números

    val numberArray = intArrayOf(2,13,8,9,10,15)

    //Option 1
    println("Number mas alto: ${numberArray.max()}")

    //Option 2
    var numbers = numberArray[0]
    for(i in numberArray){
        if(i > numbers) numbers = i
    }
    println("Numero mas alto: $numbers")
}

private fun exerciseTwo(){
    //Calcular	el	factorial	de	un	número

    val factorialNumber = 10
    var total = 1
    for(i in 1..factorialNumber){
        total *= i
    }

    println("Factorial de $factorialNumber = $total")
}

private fun exerciseThree(){
    //Ordenar	un	vector	de	números.

    val numbers = intArrayOf(1,4,7,9,2,3,8,6,5,10)

    println(numbers.sorted())

}

private fun exerciseFour(){
    //Detectar cuando una palabra introducida es un	palíndromo (se lee	igual de izquierda	a
    //derecha, que de derecha a	izquierda).	Por	ejemplo: Ana, arenera, oso,	radar,
    //reconocer, rotor,	salas,	seres,	somos,	sometemos,	etc.

    //Option 1
    print("Introduce una palabra: ")
    val word = readln()

    //Option 1
    if(word == word.reversed()) println("$word es un palindromo")

    //Option 2
    var reversed = ""
    for(i in word.length - 1 downTo 0){
        reversed += word[i]
    }

    if( reversed == word) println("$reversed es un palindromo")
}

private fun exerciseFive(){
    //Introducir dos matrices y	multiplicarlas

    val matriz = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6)
    )

    var total = 1
    for (i in matriz){
        for(m in i){
            total *= m
        }
    }
    println("Multiplicacion total: $total")
} //Pendiente de revision y mejorar

private fun exerciseSix(){
    //Realizar un programa que nos detecte si los caracteres que introducimos son letras,
    //números	u	otra	cosa.


    print("Introduce caracteres: ")
    val text = readln()

    for(i in text.indices){
        if(text[i].isDigit())
            println("${text[i]} es un numero")
        else if(text[i].isLetter())
            println("${text[i]} es una letra")
        else
            println("Es otra cosa")
    }

}

private fun exerciseSeven(){

    val characters = "SE VA A CONVERTIR A MINUSCULA"
    println(characters.lowercase())
    val minus = "ahora a mayuscula"
    println(minus.uppercase())


}

private fun exerciseEight(){

    print("Introduce una operacion matematica: ")
    val op = readln()

    print("Introduce el primer numero: ")
    val numOne = readln().toInt()
    print("Introduce el segundo numero: ")
    val numTwo = readln().toInt()

    val operation = Operations()

    when(op){
        "+" -> println(operation.getSuma(numOne, numTwo))
        "-" -> println(operation.getRest(numOne, numTwo))
        "*" -> println(operation.getMulti(numTwo, numOne))
        "/" -> println(operation.getDivision(numTwo, numOne))
        else -> println("Operacion no soportada")
    }
}