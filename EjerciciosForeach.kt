fun main() {

    //exerciseOne()
    //exerciseTwo()
    //exerciseThree()
    //exerciseFour()
    //exerciseFive()
    //exerciseSix()
    //exerciseSeven()
    //exerciseEight()
    exerciseNine()
}


private fun exerciseOne(){

    //Dado una lista de números enteros,
    // escribe un código que determine si todos los elementos de la lista son pares.

    val listNum = listOf(2,4,6,8,10, 11)
    var pares = true

    listNum.forEach { num ->
        if(num % 2 != 0){
            pares = false
        }
    }

    if(pares) println("Todos los numeros de la lista son pares")
    else println("No lo son")
}

private fun exerciseTwo(){

    //Dado una lista de cadenas de texto, escribe un código que determine si alguna
    // de las cadenas es un palíndromo (se lee igual de izquierda a derecha
    // y de derecha a izquierda).

    val palindromos = listOf("anna", "oso", "aibohphobia", "arenera", "Seres",
        "pepe", "latin")

    palindromos.forEach { word ->
        if(word == word.reversed()){
            println("Es un palindromo $word")
        }
    }
}

private fun exerciseThree(){

    //Dado una lista de números enteros,
    // escribe un código que calcule la media aritmética de los elementos de la lista.

    val nums = listOf(4, 6, 8, 10, 16, 28)
    var count = 0

    nums.forEach { num ->
        count += num
    }

    println("Total: $count")
    println("Media aritmetica: ${count / nums.size}")
}

private fun exerciseFour(){

    // Dado una lista de cadenas de texto,
    // escribe un código que determine cuántas de las cadenas tienen más de 5 caracteres.

    val listCharacter = listOf("hola", "adios", "casa", "elefante", "terremoto")

    listCharacter.forEach { word ->
        if(word.length > 5) println("Word: $word")
    }
}

private fun exerciseFive(){

    //Dado una lista de números enteros,
    //escribe un código que determine si hay algún número impar en la lista.

    val listNumbers = listOf(2,4,5,8,9,12,33)
    var impar = false

    listNumbers.forEach { num ->
        if(num % 2 != 0) impar = true
    }

    if(impar) println("Hay numeros impares en la lista")
    else println("No hay")
}

private fun exerciseSix(){

    //Dado una lista de cadenas de texto,
    //escribe un código que determine si todas las cadenas tienen más de 5 caracteres.

    val listCharacters = listOf("Lunatone", "Charmander", "Pikachu", "Ash")
    var pokemons = true
    listCharacters.forEach { poke ->
        if(poke.lowercase().length < 5) pokemons = false
    }

    if (pokemons) println("Tienen mas de 5 caracteres")
    else println("No los tienen")
}

private fun exerciseSeven(){

    //Dado una lista de números enteros, escribe un
    //código que determine si hay algún número que sea divisible tanto
    //por 2 como por 3 al mismo tiempo.

    val numbers = listOf(1,2,5,6,9,33,21,23,24,66,60,30)

    numbers.forEach { num ->
        if(num % 2 == 0 && num % 3 == 0){
            println("Numero divisible entre 2 y 3: $num")
        }
    }
}

private fun exerciseEight(){

    //Dado una lista de cadenas de texto, escribe un código que determine
    //cuántas de las cadenas tienen más de 5 caracteres y son palíndromos
    //(se leen igual de izquierda a derecha y de derecha a izquierda).

    val palindromos = listOf("anna", "oso", "aibohphobia", "arenera", "seres",
        "pepe", "latin")

    palindromos.forEach { pal ->

        if(pal.length > 5 && pal == pal.reversed()){
            println("Palabra palindroma con mas de 5 caracteres: $pal")
        }
    }
}

private fun exerciseNine(){

    //Dado una matriz de enteros, escribe un código que determine cuántos elementos
    //de la matriz son múltiplos de 3 y no de 5, y que además sean mayores a 10 y menores a 20.

    val matrix = listOf(3,6,23,25,30,33,35,21,15,12,7)

    matrix.forEach { mat ->
        if(mat % 3 == 0 && mat % 5 != 0 && mat > 10 && mat < 20){
            println("Number: $mat")
        }
    }
}