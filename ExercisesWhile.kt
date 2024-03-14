fun main() {
    //exerciseOne()
    //exerciseTwo()
    //exerciseThree()
    //exerciseFour()
    //exerciseFive()
    //exerciseSix()
    //exerciseSeven()
    exerciseEight()
}

private fun exerciseOne(){
    //Crea una función que reciba una lista de números enteros y un número entero n,
    //y devuelva un mensaje indicando que n se encuentra en la lista en el índice correspondiente.
    //Si n no aparece en la lista, se debe devolver un mensaje indicando que no se encontró.

    val listNumbers = listOf(1,2,6,7,9,10,4,77)
    print("Numero: ")
    val num = readln()
    var count = 0

    while(count < listNumbers.size){

        if(listNumbers.contains(num.toInt())){
            println("El numero $num se encuentra en la lista en el " +
                    "indice ${listNumbers.indexOf(num.toInt())}")
            break
        }else println("El $num no se encuentra en la lista")
        count += 1
    }
}

private fun exerciseTwo(){
    //Crea una función que reciba una lista de números enteros y devuelva un
    //mensaje indicando la suma de todos los números pares de la lista.

    val listNumbers = listOf(1,2,4,6,8,10,23,21,44,60,100)
    var count = 0
    var sum = 0

    while(count < listNumbers.size){

        if(listNumbers[count] % 2 == 0) sum += listNumbers[count]
        count += 1
    }
    println("Total $sum")
}

private fun exerciseThree(){
    //Crea una función que reciba una lista de números enteros y
    //devuelva una nueva lista con todos los números impares de la lista original.

    val listNum = listOf(1,2,3,5,7,8,10,11,23,31,66,123,231)
    var counter = 0
    val listImpares = mutableListOf<Int>()

    while(counter < listNum.size){
        if(listNum[counter] % 2 != 0) listImpares.add(listNum[counter])
        counter += 1
    }

    println("Lista de numeros impares $listImpares")
}

private fun exerciseFour(){
    //Crea una función que reciba una lista de números enteros y un número entero n, y
    //devuelva un mensaje indicando si hay al menos un par de números en la lista que sumen n.
    //Si se cumple la condición, se debe devolver un mensaje indicando que se encontró un par de
    //números. Si no se cumple la condición, se debe devolver un mensaje indicando que no
    //se encontró ningún par de números.

    val listNumbers = listOf(1,2,4,6,8,333,421,884,14,56,133,12)
    print("Numero: ")
    val number = readln()
    var counter = 0

    while(counter < listNumbers.size){
        var j = 0
        while(j < listNumbers.size){
            val sum = listNumbers[counter] + listNumbers[j]
            if(sum == number.toInt()) {
                println("${listNumbers[counter]}, ${listNumbers[j]}")
            }
            j += 1
        }
        counter += 1
    }
}

private fun exerciseFive(){
    //Crea una función que reciba una lista de números enteros y
    //devuelva un mensaje indicando el número más grande de la lista.
    val listNum = listOf(1,2,5,7,4,8,9,10,13,1,2,14,11)
    var counter = 0
    var j = 0

    while(counter < listNum.size){
        if(listNum[j] < listNum[counter]){
            j += 1
            println("Mayor numero: ${listNum[counter]}")
        }else println("Num max: ${listNum[j]}")

        counter += 1
    }
}

private fun exerciseSix(){
    //Crea una función que reciba una lista de palabras y una palabra, y
    //devuelva un mensaje indicando si la palabra aparece al menos una vez en la lista.
    //Si la palabra aparece, se debe devolver un mensaje indicando que se encontró.
    //Si no aparece, se debe devolver un mensaje indicando que no se encontró.

    val words = listOf("casa", "luna", "sol", "white", "park", "football", "basket", "sol")

    print("Introduce una palabra: ")
    val word = readln()
    var count = 0
    var wordCount = 0

    while (count < words.size){

        if(word == words[count]){
            wordCount += 1
            println("La palabra $word aparece $wordCount veces")
        }else println("La palabra no se encontro")

        count += 1
    }
}

private fun exerciseSeven(){
    //Crea una función que reciba una lista de palabras y devuelva una
    //nueva lista con todas las palabras en mayúsculas.

    val words = listOf("ice", "tea", "card", "bird", "penguin", "jump", "see")
    var count = 0
    val wordsUpperCase = mutableListOf<String>()

    while(count < words.size){
       wordsUpperCase.add( words[count].uppercase())
        count += 1
    }
    println("Todas en mayusculas $wordsUpperCase")
}

private fun exerciseEight(){
    //Crea una función que reciba una lista de palabras y devuelva una nueva lista con
    //todas las palabras que comiencen con la misma letra que su final.

    val words = listOf("pig", "water", "earth", "assassin", "street", "fight", "bitcoin", "cut",
        "going", "ubuntu", "dead", "boob")
    var count = 0
    val newListLastUpper = mutableListOf<String>()

    while (count < words.size){

        if(words[count].toCharArray()[0] == words[count].toCharArray()[words[count].length - 1]){
            newListLastUpper.add(words[count])
        }

        count += 1
    }
    println("Primera y ultima letra coinciden $newListLastUpper")
}