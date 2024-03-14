fun main() {
    //exerciseEleven()
    //exerciseTwelve()
    //exerciseThirteen()
    //exerciseFourteen()
    //exerciseFifteen()
    //exerciseSixteen()
    //exerciseSeventeen()
    //exerciseEighteen()
    //exerciseNineteen()
    exerciseTwenty()
}

private fun exerciseEleven(){
    //Crea un bucle infinito que imprima los números impares del 1 al infinito
    var count = 0

    while(true){

        if(count % 2 != 0) println(count)

        if(count > 200) break
        count += 1
    }
}

private fun exerciseTwelve(){
    //Crea un bucle infinito que imprima la secuencia de fibonacci hasta el número 100
    var num0 = 0
    var num1 = 1
    while (true){

        for (i in 1..100){
            println(num0)
            val sum = num0 + num1
            num0 = num1
            num1 = sum
        }
        break
    }
}

private fun exerciseThirteen(){
    //Crea un bucle infinito que genere números aleatorios y los sume,
    //si la suma supera 1000, imprime la suma y sale del bucle.

    var sum = 0
    while(true){

        val random = (0..10000).random()
        sum += random

        if(sum >= 1000){
            println(sum)
            break
        }
    }
}

private fun exerciseFourteen(){
    //Crea un bucle infinito que pida un número al usuario y
    //calcule su factorial hasta que el usuario ingrese 0
    var mult = 1

    while(true){
        print("Introduce un numero: ")
        val num = readln()

        if(num.toInt() == 0) break

        (1..num.toInt()).forEach { number ->
            mult *= number
        }

        println("Factorial de $num: $mult")
        mult = 1
    }
}

private fun exerciseFifteen(){
    //Crea un bucle infinito que imprima los números del 1 al 10 y luego vuelva a comenzar
    var count = 1

    while(true){
        println(count)
        count += 1

        if(count >= 10) count = 1
    }
}

private fun exerciseSixteen(){
    //Crea un bucle infinito que genere números aleatorios entre 1 y 100 y
    //los imprima hasta que se genere el número 50 tres veces seguidas

    var counter = 0
    while(true){

        val random = (1..100).random()

        if(random == 50){
            counter += 1
            println("Veces generado el numero $random: $counter veces")
        }
        if(counter >= 3) break
    }

}

private fun exerciseSeventeen(){
    //Crea un bucle infinito que pida dos números al
    //usuario y calcule su división hasta que el usuario ingrese 0

    while(true){

        print("Introduce primer numero: ")
        val numbOne = readln()
        print("Introduce segundo numero: ")
        val numbTwo = readln()

        if(numbOne.toInt() == 0 || numbTwo.toInt() == 0) break

        println("$numbOne entre $numbTwo = ${numbOne.toInt() / numbTwo.toInt()}")
    }

}

private fun exerciseEighteen(){
    //Crea un bucle infinito que genere números aleatorios y los imprima hasta que se
    //genere el número 100 y luego sale del bucle y vuelve a comenzar

    while(true){

        val rdm = (1..200).random()

        println(rdm)

        if(rdm == 100) continue
    }
}

private fun exerciseNineteen(){
    //Crea un bucle infinito que imprima los números del 1 al 20 y
    //luego retroceda imprimiendo los números del 20 al 1

    while (true){
        for(i in 1..20){
            println(i)
            if(i == 20){
                for(n in 20 downTo 1){
                    println(n)
                }
            }
        }
    }
}

private fun exerciseTwenty(){
    //Crea un bucle infinito que genere números aleatorios y los imprima hasta
    //que se genere el número 50 y luego sale del bucle y vuelve a comenzar

    while(true){
        val rdm = (1..50).random()
        println(rdm)
        if(rdm == 50) continue
    }
}