fun main() {
    //exerciseEleven()
    //exerciseTwelve()
    //exerciseThirteen()
    //exerciseFourteen()
    //exerciseFifteen()
    //exerciseSixteen()
    //exerciseSeventeen()
    //exerciseEighteen()
    exerciseNineteen()
}

private fun exerciseEleven(){
    //Crea una función que tome una lista de números enteros y devuelva una
    //nueva lista con todos los elementos que sean múltiplos de 5. Utiliza una
    //función anidada para determinar si un número es múltiplo de 5 o no.

    val numbers = listOf(1,5,15,25,45,50,100,7,8,80,85,13,14,16,78,32,47,90)

    fun multiple(numb: List<Int>): MutableList<Int> {

        val n = mutableListOf<Int>()
        for(i in numb.indices){
            if(numb[i] % 5 == 0) n.add(numb[i])
        }
        return n
    }
    println(multiple(numbers))
}

private fun exerciseTwelve(){
    //Crea una función que tome una lista de cadenas y devuelva la cadena con mayor
    //cantidad de consonantes. Utiliza una función anidada para contar el número de
    //consonantes en una cadena y devolver un valor entero.

    val words = listOf("plain", "street", "cryptocurrencies", "extreme", "chilli", "drift",
        "toyota")


    fun consonants(word: List<String>): Int {
        val vocals = listOf('a', 'e', 'i', 'o', 'u')
        var firstWord =  word[0].toCharArray().count { c -> !vocals.contains(c) }
        for(i in word.indices){
            val counts = word[i].toCharArray().count { c ->
                !vocals.contains(c)
            }
            if(firstWord < counts) firstWord = counts
        }
        return firstWord
    }

    println(consonants(words))
}

private fun exerciseThirteen(){
    //Crea una función que tome una lista de números enteros y devuelva una
    //nueva lista con todos los elementos que sean pares y mayores a 10. Utiliza
    //una función anidada para determinar si un número es par o no.

    val listNumbers = listOf(1,2,5,6,8,13,20,30,100,200,60,66,43,21,67,89,33,44,68,103,112,72,62)

    fun numbs(numbers: List<Int>): MutableList<Int>{
        val n = mutableListOf<Int>()
        for (i in numbers.indices){
            if(numbers[i] % 2 == 0 && numbers[i] > 10) n.add(numbers[i])
        }
        return n
    }
    println(numbs(listNumbers))
}

private fun exerciseFourteen(){
    //Crea una función que tome una lista de cadenas y devuelva una nueva lista con
    //todas las palabras que tengan una longitud mayor a 4 y comiencen con una vocal.
    //Utiliza una función anidada para determinar si una palabra comienza con una vocal o no.

    val words = listOf("abanico", "antecedentes", "mugriento", "electricidad")

    fun lists(word: List<String>): MutableList<String>{
        val vocals = listOf('a', 'e', 'i', 'o', 'u')
        val w = mutableListOf<String>()
        for(i in word.indices){
            if(word[i].length > 4 && vocals.contains(word[i][0])) w.add(word[i])
        }
        return w
    }
    println(lists(words))
}

private fun exerciseFifteen(){
    //Crea una función que tome una lista de números enteros y devuelva una
    //nueva lista con todos los elementos que sean múltiplos de 7 y menores a 50.
    //Utiliza una función anidada para determinar si un número es múltiplo de 7 o no.

    val numbers = listOf(333,7,10,21,34,45,56,63,99,97,107,113)

    fun numbs(numb: List<Int>): MutableList<Int>{
        val n = mutableListOf<Int>()
        for(i in numb.indices){
            if(numb[i] % 7 == 0 && numb[i] < 50) n.add(numb[i])
        }
        return n
    }
    println(numbs(numbers))
}

private fun exerciseSixteen(){
    //Crea una función que tome una lista de cadenas y devuelva una nueva lista con
    //todas las palabras que tengan una longitud mayor a 6 y comiencen con una consonante.
    //Utiliza una función anidada para determinar si una palabra comienza con una consonante o no.

    val words = listOf("paraguas", "penguin", "abeja", "hamburguesa", "einstein")

    fun characters(word: List<String>): MutableList<String>{
        val w = mutableListOf<String>()
        val vocals = listOf('a', 'e', 'i', 'o', 'u')
        for(i in word.indices){
            if(word[i].length > 6 && !vocals.contains(word[i][0])) w.add(word[i])
        }
        return w
    }
    println(characters(words))
}

private fun exerciseSeventeen(){
    //Crea una función que tome una lista de números enteros y devuelva una nueva
    //lista con todos los elementos que sean múltiplos de 3 y mayores a 20. Utiliza
    //una función anidada para determinar si un número es múltiplo de 3 o no.

    val numb = listOf(3,6,10,17,1,18,56,33,44,59,78,15)

    fun numbers(numbs: List<Int>): MutableList<Int>{
        val n = mutableListOf<Int>()
        for(i in numbs.indices){
            if(numbs[i] % 3 == 0 && numbs[i] > 20) n.add(numbs[i])
        }
        return n
    }
    println(numbers(numb))
}

private fun exerciseEighteen(){
    //Crea una función que tome una lista de cadenas y devuelva la cadena con mayor
    //cantidad de caracteres especiales. Utiliza una función anidada para contar el
    //número de caracteres especiales en una cadena y devolver un valor entero.

    val word = listOf("%ss", "&hola", "/da/d/a")

    fun especialCharacters(chars: List<String>): Int{
        val characters = listOf('$', '%', '?', '&', '/')
        var firstCharacter = chars[0].toCharArray().count { c ->
            characters.contains(c)
        }
        for(i in chars.indices){
            val count = chars[i].toCharArray().count{ c ->
                characters.contains(c)
            }
            if(firstCharacter < count) firstCharacter = count
        }
        return firstCharacter
    }
    println(especialCharacters(word))
}

private fun exerciseNineteen(){
    //Crea una función que tome una lista de números enteros y devuelva una nueva
    //lista con todos los elementos que sean primos y menores a 20. Utiliza una función
    //anidada para determinar si un número es primo o no.

    val listNumber = listOf(1,2,4,3,5,7,13,21,23,46,342,55)

    fun isPrimo(numb: Int): Boolean{
        if(numb < 2) return false

        for(i in 2 until numb){
            if(numb % i == 0) return false
        }
        return true
    }

    for(i in listNumber.indices){
        if (isPrimo(listNumber[i]) && listNumber[i] < 20) println(listNumber[i])
    }
    
}