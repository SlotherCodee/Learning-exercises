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
    //Contar caracteres duplicados: Escribe un programa que cuente los caracteres
    //caracteres de una cadena dada.

    print("Introduce una palabra: ")
    val word = readln()
    for(i in word.indices){
        val count = word.toCharArray().count { c ->
            word[i] == c
        }
        println("La letra ${word[i]} aparece $count veces")
    }
}

private fun exerciseTwo(){
    //Encontrar el primer carácter no repetido: Escribe un programa que devuelva el
    //primer carácter no repetido de una cadena dada.

    print("Introduce palabra: ")
    val word = readln()
    for(i in word.indices){
        val count = word.toCharArray().count { c ->
            word[i] == c
        }
        if(count < 2){
            println("Caracter ${word[i]} es el primero en no repetir")
            break
        }
    }
}

private fun exerciseThree(){
    // Invertir letras y palabras: Escribe un programa que invierta las letras de
    //cada palabra y un programa que invierta las letras de cada palabra y las
    //palabras.

    print("Introduce una palabra: ")
    val word = readln()
    var reversedLetters = ""
    println("Letras al reves")
    for(i in word.length - 1 downTo 0){
        reversedLetters += word[i]
        println(word[i])
    }
    println("Palabra al reves $reversedLetters")

}

private fun exerciseFour(){
    //Comprobar si una cadena contiene sólo dígitos: Escribe un programa que
    //compruebe si la cadena dada contiene sólo dígitos.

    print("Introduce cadena: ")
    val characters = readln()

    //Option 1
    //if(characters.isDigitsOnly()) println("Solo contiene digitos")

    //Option 2
    for(i in characters.indices){
        if(characters[i].isLetter()){
            println("El cadena contiene una letra ${characters[i]}")
            break
        }else {
            println("La cadena no contenia letras $characters")
            break
        }

    }
}

private fun exerciseFive(){
    //Contar vocales y consonantes: Escribe un programa que cuente el
    //número de vocales y consonantes en una cadena dada. Hágalo para el inglés
    //que tiene cinco vocales (a, e, i, o y u).

    print("Introduce palabra: ")
    val word = readln()

    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    val vowelsCount = word.toCharArray().count { v ->
        vowels.contains(v)
    }
    val consonantsCount = word.toCharArray().count{ c ->
        !vowels.contains(c)
    }
    println("La palabra $word contiene $vowelsCount vocales y $consonantsCount consonantes")
}

private fun exerciseSix(){
    //Contar apariciones de un determinado carácter: Escribe un programa que cuente
    //las ocurrencias de un cierto carácter en una cadena dada.

    print("Introduce caracter: ")
    val character = readln().single()
    print("Introduce frase: ")
    val words = readln()
    var count = 0

    for(i in words.indices){
        if(words[i] == character) count += 1
    }

    println("El caracter $character ha aparecido $count veces")
}

private fun exerciseSeven(){
    //Convertir String en int, long, float o double: Escriba un programa
    //que convierta el objeto String dado (que representa un número) en int,
    //long, float o double

    //val test = String()
    //println(test.toInt())
}

private fun exerciseEight(){
    //Eliminar los espacios en blanco de una cadena: Escribe un programa que elimine todos
    //espacios en blanco de la cadena dada.

    print("Escribe una cadena: ")
    val word = readln()

    println(word.replace(" ", ""))
}

private fun exerciseNine(){
    //Unir varias cadenas con un delimitador: Escriba un programa que una las
    //cadenas dadas por el delimitador dado

    print("Escribe una cadena: ")
    val word = readln()

    println(word.replace(" ", "-"))
}

private fun exerciseTen(){
    //Comprobar si una cadena es un palíndromo:
    //Escribe un programa que determine si la cadena dada es un palíndromo o no.


    print("Intoduce una palabra: ")
    val word = readln()

    //Option 1
    if(word == word.reversed()) println("Es un palindromo")


    //Option 2
    var palindrome = ""
    for(i in word.length - 1 downTo 0){
        palindrome += word[i]
    }

    if(word == palindrome) println("Is palindrome")

}