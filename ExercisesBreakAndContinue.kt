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
}

private fun exerciseOne(){
    //Dado una matriz de enteros, escribe un código que imprima solo los
    //elementos de la matriz que sean múltiplos de 3 y no de 7. Si encuentra
    //un elemento que sea múltiplo de 5, debe terminar de iterar sobre la matriz.
    val listNumber = listOf(27,21,23,129,63,37,21,43,51,52,100,47,111,56)

    for(i in listNumber.indices){
        if(listNumber[i] % 3 == 0 && listNumber[i] % 7 != 0) println(listNumber[i])
        if(listNumber[i] % 5 == 0) break
    }
}

private fun exerciseTwo(){
    //Dado una lista de objetos de una clase personalizada que tienen una propiedad
    //"edad", escribe un código que imprima solo los objetos cuyas edades sean mayores
    //a 18 y menores a 30. Si encuentra un objeto cuyo edad sea mayor a 50, debe terminar
    //de iterar sobre la lista.

    val listAge = mutableListOf<ClasePersonalizada>()

    for(i in 1..10){
        val rdm = (18..80).random()
        val cp = ClasePersonalizada(rdm)
        listAge.add(cp)
    }

    for(a in listAge.indices){
        if(listAge[a].age in 19..29)  println("Edad: ${listAge[a].age}")
        if(listAge[a].age > 50) break
    }
}

private fun exerciseThree(){
    //Dado una lista de números enteros, escribe un código que sume solo los
    //números que sean múltiplos de 3 o de 7. Si encuentra un número que sea múltiplo de
    //2 y de 5 al mismo tiempo, debe saltearlo y continuar con la siguiente iteración.

    val listNumber = listOf(1,3,10,5,6,7,8,20,50,21,37,42,23,21,36)
    var sum = 0

    for(i in listNumber.indices){
        if(listNumber[i] % 3 == 0 || listNumber[i] % 7 == 0) sum += listNumber[i]
        if(listNumber[i] % 2 == 0 && listNumber[i] % 5 == 0) continue
    }
    println("Suma total $sum")
}

private fun exerciseFour(){
    //Dado una lista de cadenas de texto, escribe un código que imprima solo aquellas
    //que tengan más de 5 caracteres y sean palíndromos (es decir, que se leen igual de
    //izquierda a derecha y de derecha a izquierda). Si encuentra una cadena que no
    //tenga más de 3 caracteres, debe terminar de iterar sobre la lista.

    val palindrome = listOf("soldadlos","reconocer", "oso", "casa", "recorrer", "hielo", "azul",
        "rallar", "rapar", "dañad", "oruro", "ancho")

    for(i in palindrome.indices){
        if(palindrome[i] == palindrome[i].reversed() && palindrome[i].length > 5)
            println(palindrome[i])
        if(palindrome[i].length < 4) break
    }

}

private fun exerciseFive(){
    //Dado una matriz de enteros, escribe un código que imprima solo los elementos de
    //la matriz que sean múltiplos de 3 y no de 5, y que también sean mayores a 10 y menores
    //a 20. Si encuentra un elemento que cumpla con todas estas condiciones y además sea
    //múltiplo de 2, debe terminar de iterar sobre la matriz.

    val listNumb = listOf(1,2,5,7,8,10,100,12,11,22,13,16,19,15,17,30,34,67,87,32,45,50,77)

    for(i in listNumb.indices){
        if(listNumb[i] % 3 == 0 && listNumb[i] % 5 != 0 && listNumb[i] > 10 && listNumb[i] < 20){
            println(listNumb[i])
            if(listNumb[i] % 2 == 0) break
        }
    }
}

private fun exerciseSix(){
    //Dado una lista de números enteros, escribe un código que sume solo los números pares.
    //Si encuentra un número impar, debe terminar de iterar sobre la lista.

    val numbers = listOf(2,4,6,8,7,60)
    var count = 0

    for(i in numbers.indices){
        if(numbers[i] % 2 != 0) break
        else count += numbers[i]
    }

    println("Suma: $count")
}

private fun exerciseSeven(){
    //Dado una lista de cadenas de texto, escribe un código que imprima solo aquellas
    //que comiencen con la letra 'a' y tengan más de 3 caracteres. Si encuentra una cadena
    //que no cumpla con estas condiciones, debe terminar de iterar sobre la lista.

    val words = listOf("arbol", "avellana","azucar", "ballena")

    for(i in words.indices){
        if(words[i].lowercase().startsWith('a') && words[i].length > 3) println(words[i])
        else break
    }
}

private fun exerciseEight(){
    //Dado una lista de objetos de una clase personalizada que tienen una propiedad "nombre"
    //y una propiedad "edad", escribe un código que imprima solo los objetos cuyo nombre comience
    //con la letra 'a' y cuyo edad sea mayor a 20. Si encuentra un objeto cuyo nombre comience
    //con la letra 'b', debe terminar de iterar sobre la lista.

    val p1 = Person(21, "Andres")
    val p2 = Person(22, "Borja")
    val p3 = Person(31, "Amaya")
    val p4 = Person(18, "Anastasia")

    val listPersons = listOf(p1, p3, p2 , p4)

    for(i in listPersons.indices){
        if(listPersons[i].name.lowercase().startsWith('a') && listPersons[i].age > 20)
            println(listPersons[i].name)
        if(listPersons[i].name.lowercase().startsWith('b')) break
    }

}

private fun exerciseNine(){
    //Dado una lista de números enteros, escribe un código que imprima solo los
    //números primos. Si encuentra un número que no es primo, debe continuar con la
    //siguiente iteración.

    val numbers = listOf(1,3,5,7,11,13,2,4,6)
    var count = 0
    for(i in 2 until numbers.size){
        if(numbers[count] % i == 0 && numbers[i] < 2) continue
        else println(numbers[i])
        count += 1

    }


}

private fun exerciseTen(){
    //Dado una lista de cadenas de texto, escribe un código que imprima solo aquellas que
    //tengan más de 5 caracteres y sean palíndromos (es decir, que se leen igual de izquierda
    //a derecha y de derecha a izquierda). Si encuentra una cadena que no tenga más de 3
    //caracteres, debe terminar de iterar sobre la lista.

    val words = listOf("casa", "reconocer", "narran", "sol", "arenera")

    for(i in words.indices){
        if(words[i].length > 5 && words[i] == words[i].reversed()){
            println(words[i])
        }
        if (words[i].length < 4) break
    }

}