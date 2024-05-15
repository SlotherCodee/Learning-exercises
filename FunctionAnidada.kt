import kotlin.math.absoluteValue

fun main() {
    //exerciseOne()
    //exerciseTwo()
    //exerciseThree()
    exerciseFour()
    //exerciseFive()
    //exerciseSix()
    //exerciseSeven()
    //exerciseEight()
    //exerciseNine()
    //exerciseTen()
}

private fun exerciseOne(){
    //Crea una función que tome una lista de números enteros y devuelva una nueva lista
    //con todos los elementos pares. Utiliza una función anidada para determinar si un
    //número es par o no.
    val numbers = listOf(1,2,4,6,8,3,6,20,12,15,17,44)

    fun numbs(number: List<Int>): MutableList<Int>{
        val pares = mutableListOf<Int>()
        for(i in number.indices){
            if(number[i] % 2 == 0) pares.add(number[i])
        }
        return pares
    }
    println(numbs(numbers))
}

private fun exerciseTwo(){
    //Crea una función que tome una lista de cadenas y devuelva una nueva lista con todas
    //las cadenas que tengan una longitud mayor a 5. Utiliza una función anidada para comparar
    //la longitud de una cadena y devolver un valor booleano.

    val words = listOf("window", "fish", "cardano", "tennis", "snowboard")

    fun wordLength(word: List<String>): Boolean{
        val wordsLengthFive = mutableListOf<String>()
        var bool = false
        for(i in word.indices){
            if(word[i].length > 5){
                wordsLengthFive.add(word[i])
                bool = true
            }
        }
        println(wordsLengthFive)
        return bool
    }
    println(wordLength(words))
}

private fun exerciseThree(){
    //Crea una función que tome una lista de números enteros y devuelva el promedio de
    //todos los elementos. Utiliza una función anidada para calcular la suma de todos
    //los elementos de la lista.

    val numbs = listOf(1,5,67,89,32,1,57,23,66,33,5,8,2)

    fun sumNumbers(numbers: List<Int>): Int {
        var sum = 0
        for (i in numbers.indices){
            sum += numbers[i]
        }

        return sum / numbers.size
    }
    println(sumNumbers(numbs))
}

private fun exerciseFour(){
    //Crea una función que tome una lista de cadenas y devuelva la cadena con mayor cantidad
    //de vocales. Utiliza una función anidada para contar el número de vocales en una cadena
    //y devolver un valor entero.

    val words = listOf("casa", "ortopedia", "albericoque", "umpalumpa", "humareda", "ignacio")
    fun countVocals(word: List<String>): Int{
        val vocals = listOf('a', 'e', 'i', 'o', 'u')
        var firstWord = word[0].toCharArray().count { w -> vocals.contains(w) }
        for(i in word.indices){
            val count = word[i].toCharArray().count { c ->
                vocals.contains(c)
            }
            if(firstWord < count) firstWord = count
        }
        return firstWord
    }
    println(countVocals(words))
}

private fun exerciseFive(){
    //Crea una función que tome una lista de números enteros y devuelva una nueva lista
    //con todos los elementos únicos (sin repetidos). Utiliza una función anidada para determinar
    //si un elemento está contenido en la lista o no.

    val numbers = listOf(1,6,8,9,10,2,5,6,8,10,2)

    fun repeat(numbs: List<Int>){
        val newList = mutableListOf<Int>()
        for(i in numbs.indices){
            if(!newList.contains(numbs[i])) newList.add(numbs[i])
        }
        println(newList)
    }
    repeat(numbers)
}

private fun exerciseSix(){
    //Crea una función que tome una lista de cadenas y devuelva una nueva lista con todas
    //las palabras que comiencen con una consonante. Utiliza una función anidada para
    //determinar si una cadena comienza con una consonante o no.

    val words = listOf("wait", "anaconda", "bee", "osmosis", "ice", "house", "four")

    fun consonant(word: List<String>){
        val vocals = listOf('a', 'e', 'i', 'o', 'u')
        val listConsonant = mutableListOf<String>()

        for(i in word.indices){
            if(!vocals.contains(word[i][0]))
                listConsonant.add(word[i])
        }
        println(listConsonant)
    }
    consonant(words)
}

private fun exerciseSeven(){
    //Crea una función que tome una lista de números enteros y devuelva una nueva lista con
    //todos los elementos que sean múltiplos de 3. Utiliza una función anidada para determinar
    //si un número es múltiplo de 3 o no.

    val numbers = listOf(1,3,6,8,9,10,12,13,16,18,21,23,34,37,93)

    fun multiplesThree(numbs: List<Int>): MutableList<Int>{
        val num = mutableListOf<Int>()
        for(i in numbs.indices){
            if(numbs[i] % 3 == 0) num.add(numbs[i])
        }
        return num
    }
    println(multiplesThree(numbers))
}

private fun exerciseEight(){
    //Crea una función que tome una lista de cadenas y devuelva la cadena con
    //mayor cantidad de palabras. Utiliza una función anidada para contar el número
    //de palabras en una cadena y devolver un valor entero.

    val w = listOf("casa", "camion", "aeropuerto", "vivienda", "onomatopella", "delivery",
        "funcionamineto")

    fun countWords(words: List<String>): Int{
        val maxCharacters = mutableListOf<Int>()
        for(i in words.indices){
            maxCharacters.add(words[i].length)
        }
        words.forEach { w ->
            if(w.length == maxCharacters.max()) println(w)
        }
        return maxCharacters.max()
    }
    println(countWords(w))
}

private fun exerciseNine(){
    //Crea una función que tome una lista de números enteros y devuelva una nueva lista
    //con todos los elementos que sean primos. Utiliza una función anidada para determinar
    //si un número es primo o no.

    val numbers = listOf(1,2,3,5,7,11,13,21,23,46,45,23,19,17,33,58,61)


    fun isPrimo(number: Int): Boolean{

        if (number < 2) {
            return false
        }
        for (i in 2 until number) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }

    for(i in numbers.indices){
        if(isPrimo(numbers[i])) println(numbers[i])
    }

}

private fun exerciseTen(){
    //Crea una función que tome una lista de cadenas y devuelva una nueva lista con
    //todas las palabras que tengan una longitud mayor a 7. Utiliza una función anidada
    //para comparar la longitud de una palabra y devolver un valor booleano.

    val characters = listOf("casa", "camion", "aeropuerto", "vivienda", "onomatopella", "delivery",
        "funcionamineto")

    fun newList(c: List<String>): Boolean{
        val lengthMaxSeven = mutableListOf<String>()
        for(i in c.indices){
            if(c[i].length > 7) lengthMaxSeven.add(c[i])
        }
        println(lengthMaxSeven)
        return true
    }
    newList(characters)
}