import kotlin.math.*

fun main() {
    //exerciseOne()
    //exerciseTwo()
    //exerciseThree()
    //exerciseFour()
    //exerciseFive()
    //exerciseSix()
    //exerciseSeven()
    //exerciseEight()
    //exerciseNine()
    //exerciseTen()
    //exerciseEleven()
    //exerciseTwelve()
    //exerciseThirteen()
    //exerciseFourteen()
    exerciseFifteen()
}

private fun exerciseOne(){
    //Imprimir los números del 1 al 10.

    for(i in 1..10){
        println(i)
    }
}

private fun exerciseTwo(){
    //Imprimir los números pares del 2 al 20.

    for (i in 1..20){
        if(i % 2 == 0) println(i)
    }
}

private fun exerciseThree(){
    //Imprimir la suma de los números del 1 al 100.

    var count = 0

    for (i in 1..100){
        count += i
    }
    println("Total $count")
}

private fun exerciseFour(){
    //Imprimir los números del 10 al 1 en orden decreciente.

    for(i in 10 downTo  1){
        println(i)
    }
}

private fun exerciseFive(){
    //Imprimir la tabla de multiplicar del número dado (por ejemplo, si se da el número 7,
    //imprimir 7x1=7, 7x2=14, ..., 7x10=70).

    print("Introduze un numero: ")
    val number = readln()

    for(i in 1..10){
        println("$number x $i = ${number.toInt() * i}")
    }
}

private fun exerciseSix(){
    //Imprimir los números impares del 1 al 99.

    for(i in 1..99){
        if(i % 2 != 0) println(i)
    }
}

private fun exerciseSeven(){
    //Imprimir la suma de los números pares del 2 al 100.

    var sum = 0
    for(i in 1..100){
        if (i % 2 == 0) sum += i
    }
    println("Total de la suma: $sum")
}

private fun exerciseEight(){
    //Imprimir los números múltiplos de 5 del 5 al 50.
    for(i in 5..50){
        if(i % 5 == 0) println(i)
    }
}

private fun exerciseNine(){
    //Imprimir los números fibonacci hasta el n-ésimo término (donde n es un número dado).

    print("Introduce un numero: ")
    val number = readln()

    var num1 = 0
    var num2 = 1

    for(i in 1..number.toInt()){
        println(num1)
        val fib = num1 + num2
        num1 = num2
        num2 = fib
    }
}

private fun exerciseTen(){
    //Imprimir los números triangulares hasta el n-ésimo término (donde n es un número dado).

    print("Introduce un numero: ")
    val numb = readln()
    var sum = 0

    for(i in 1..numb.toInt()){
        sum += i
    }
    println("Total $sum")
}

private fun exerciseEleven(){
    //Imprimir los números primos hasta el n-ésimo término (donde n es un número dado).


}

private fun exerciseTwelve(){
    //Imprimir la suma de los cuadrados de los números del 1 al n (donde n es un número dado).

    print("Numero: ")
    val num = readln()
    var sum = 0

    for (i in 1..num.toInt()){
        val cuadrado = i.toDouble().pow(2)
        sum += cuadrado.toInt()
    }

    println("Suma total $sum")
}

private fun exerciseThirteen(){
    //Imprimir los números perfectos hasta el n-ésimo término (donde n es un número dado).

    print("Numero: ")
    val num = readln()
    val divisores = mutableListOf<Int>()
    var sum = 0

    for(i in 1 until  num.toInt()){
        if(num.toInt() % i == 0) divisores.add(i)
    }

    for(j in divisores.indices){
        sum += divisores[j]
    }
    if(num.toInt() == sum) println("Es un numero perfecto $sum")
    else println("No es un numero perfecto")
}

private fun exerciseFourteen(){
    //Imprimir la suma de los múltiplos de 3 y 5 hasta n (donde n es un número dado).
    print("Numero: ")
    val num = readln()
    val m = mutableListOf<Int>()
    var sum = 0
    for(i in 1..num.toInt()){
        if(i % 3 == 0 && i % 5 == 0) m.add(i)
    }

    for(j in m.indices){
        sum += m[j]
    }
    println("Suma toal $sum")
}

private fun exerciseFifteen(){
    //Imprimir la suma de los dígitos de un número dado.
    print("Numerito: ")
    val n = readln()
    var sum = 0
    for(i in n.toCharArray().indices){
        sum += n[i].digitToInt()
    }
    println("Suma $sum")
}