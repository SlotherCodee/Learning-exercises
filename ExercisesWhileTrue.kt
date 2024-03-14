import kotlin.random.Random

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
    exerciseTen()
}

private fun exerciseOne(){
    //Escribe un programa que utilice un bucle infinito para leer números del
    //usuario y calcular la suma de los números pares ingresados hasta el momento.
    //El programa debe salir del bucle cuando el usuario ingrese "q".
    var sum = 0

    while(true){
        print("Introduce un numero: ")
        val number = readln()

        if(number == 'q'.toString() || number == 'Q'.toString()) break

        if(number.toInt() % 2 == 0) sum += number.toInt()

    }

    println("Total de la suma $sum")
}

private fun exerciseTwo(){
    //Escribe un programa que utilice un bucle infinito para leer números del usuario
    //y calcular la suma de los números impares ingresados hasta el momento. El programa
    //debe salir del bucle cuando el usuario ingrese "q" o cuando se hayan ingresado más de
    //100 números.

    var sum = 0
    var countScanner = 0

    while(true){

        print("Introduce un numero: ")
        val number = readln()

        if(number == 'q'.toString() || number == 'Q'.toString() || countScanner > 100) break

        countScanner += 1

        if(number.toInt() % 2 != 0) sum += number.toInt()

    }

    println("Suma total $sum")
}

private fun exerciseThree(){
    //Escribe un programa que utilice un bucle infinito para leer números del usuario y
    //calcular la suma de los números primos ingresados hasta el momento. El programa debe salir
    //del bucle cuando el usuario ingrese "q" o cuando se hayan ingresado más de 1000 números.

    var sum = 0
    var count = 0

    while (true){

        print("Introduce un num: ")
        val num = readln()

        if(num == 'q'.toString() || num == 'Q'.toString() || count > 1000) break

        for (i in 2 until num.toInt()) {
            if (num.toInt() % i == 0) {
                println("No primo")
            }
        }

        sum += num.toInt()

        count += 1
    }

    println("Suma $sum")
}

private fun exerciseFour(){
    //Escribe un programa que utilice un bucle infinito para leer palabras del usuario
    //y verificar si son palíndromos (palabras que se leen igual de derecha a izquierda
    //que de izquierda a derecha). El programa debe salir del bucle cuando el usuario ingrese
    //"q" o cuando se hayan verificado más de 100 palabras.

    var count = 0

    while(true){

        print("Introduce una palabra: ")
        val word = readln()

        if(word == 'q'.toString() || word == 'Q'.toString() || count > 100) break

        if(word == word.reversed()){
            println("Palindromo: $word")
            count += 1
        }else{
            count += 1
            println("No es un palindromo: $word")
        }
    }
}

private fun exerciseFive(){
    //Escribe un programa que utilice un bucle infinito para leer una secuencia de números
    //del usuario y verificar si son perfectos (números que son iguales a la suma de sus divisores).
    //El programa debe salir del bucle cuando el usuario ingrese "q" o cuando se hayan verificado
    //más de 1000 números.

    var count = 0
    var sumNumPerfect = 0

    while(true){

        print("Introduce un numero: ")
        val num = readln()

        if(num == 'q'.toString() || num == 'Q'.toString() || count > 1000) break

        for(i in 1 until num.toInt()){
            if(num.toInt() % i == 0) sumNumPerfect += i
        }

        if(num.toInt() == sumNumPerfect) println("Numero perfecto $num")

        count += 1
        sumNumPerfect = 0
    }
}

private fun exerciseSix(){
    //Crea un bucle infinito que imprima "Hello World" cada segundo

    var count = 0

    while(true){
        println("Hello World")
        count += 1
        if(count > 100) break
    }
}

private fun exerciseSeven(){
    //Crea un bucle infinito que sume 1 a una variable y la imprima cada 5 iteraciones

    var sum = 0
    var count = 0

    while(true){
        sum += 1
        count += 1
        if(count % 5 == 0) println(sum)
    }
}

private fun exerciseEight(){
    //Crea un bucle infinito que genere números aleatorios y
    //los imprima hasta que se genere el número 50

    while(true){

        val rdm = (0..1000).random()
        println(rdm)
        if(rdm == 50){
            println("Enhorabuena $rdm")
            break
        }
    }
}

private fun exerciseNine(){
    //Crea un bucle infinito que pida un número al usuario y
    //lo imprima hasta que el usuario ingrese 0

    while(true){

        print("Introduce un numero: ")
        val num = readln()

        println(num)

        if(num.toInt() == 0) break
    }
}

private fun exerciseTen(){
    //Crea un bucle infinito que imprima los números pares del 0 al infinito
    var count = 0

    while(true){

        count += 1

        if(count % 2 == 0) println(count)

        if(count > 100) break
    }
}