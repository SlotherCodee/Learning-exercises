fun main() {
    //exerciseNine()
    //exerciseTen()
    //exerciseEleven()
    //exerciseTwelve()
    //exerciseThirteen()
    //exerciseFourteen()
    //exerciseFifteen()
    exerciseSixteen()
}

private fun exerciseNine(){
    //Crea una función que pida al usuario ingresar una palabra y devuelva true si la
    //palabra es una palabra que comience con mayúscula, y false en caso contrario.
    //La función debe seguir pidiendo al usuario ingresar una palabra hasta que ingrese
    //una palabra válida.

    do {
        print("Introduzca una palabra: ")
        val word = readln()

        if(word[0].isUpperCase()) println("$word empieza con mayuscula ${true}")
        else println("$word no empieza con mayuscula ${false}")

    }while(word.isNotBlank())

}

private fun exerciseTen(){
    //Crea una función que pida al usuario ingresar una palabra y devuelva true si la
    //palabra es una palabra que termine en "mente", y false en caso contrario. La función
    //debe seguir pidiendo al usuario ingresar una palabra hasta que ingrese una palabra válida.

    val suffixWord = "mente"

    do{
        print("Introduza una palabra: ")
        val word = readln()

        if(word.endsWith(suffixWord)) println(true)
        else println(false)

    }while (word.isNotBlank())
}

private fun exerciseEleven(){
    //Crea una función que pida al usuario ingresar una cadena de caracteres y devuelva
    //el número de letras que tiene. La función debe seguir pidiendo al usuario ingresar
    //una cadena hasta que ingrese una cadena válida.

    do {

        print("Introduzca una palabra: ")
        val word = readln()

        //Option 1
        //println("Total letters word $word: ${word.toCharArray().size}")

        //Option 2
        var count = 0
        word.forEach { _ ->
            count += 1
        }
        println("Total letters word $word: $count")

    }while (word.isNotEmpty())
}

private fun exerciseTwelve(){
    //Crea una función que pida al usuario ingresar una cadena de caracteres
    //y devuelva el número de dígitos que tiene. La función debe seguir pidiendo
    //al usuario ingresar una cadena hasta que ingrese una cadena válida.

    do {
        print("Escribe una palabra: ")
        val words = readln()

        var countDigit = 0
        words.forEach { c ->
            if (c.isDigit()) countDigit += 1
        }
        println("La palabra $words contiene $countDigit digitos")
    }while (words.isNotEmpty())
}

private fun exerciseThirteen(){
    //Crea una función que pida al usuario ingresar una cadena de caracteres
    //y devuelva el número de veces que se repite el último carácter de la cadena.
    //La función debe seguir pidiendo al usuario ingresar una cadena hasta que ingrese
    //una cadena válida.

    do{
        print("Escribe una palabra: ")
        val word = readln()

        val char = word.length - 1
        val total = word.count{ c ->
            c == word[char]
        }

        println("Total caracter $total")

    }while (word.isNotEmpty())
}

private fun exerciseFourteen(){
    //Crea una función que pida al usuario ingresar un número entero y devuelva true si el
    //número es múltiplo de 3, y false en caso contrario. La función debe seguir pidiendo al
    //usuario ingresar un número hasta que ingrese un número válido.

    do{
        print("Escribe un numero entero: ")
        val number = readln()

        if(number.toInt() % 3 == 0) println(true)
        else println(false)

    }while (number.isNotEmpty())
}

private fun exerciseFifteen(){
    //Crea una función que pida al usuario ingresar una palabra y devuelva
    //true si la palabra tiene más de 5 caracteres, y false en caso contrario.
    //La función debe seguir pidiendo al usuario ingresar una palabra hasta que
    //ingrese una palabra válida.

    do {
        print("Escribe una palabra: ")
        val word = readln()

        if (word.length > 5) println("$word tiene mas de 5 caracteres ${true}")
        else println("$word no llega a tener mas de 5 caracteres ${false}")

    }while (word.isNotEmpty())
}

private fun exerciseSixteen(){
    //Crea una función que pida al usuario ingresar una palabra y devuelva true
    //si la palabra es una palabra que comience y termine con la misma letra, y false
    //en caso contrario. La función debe seguir pidiendo al usuario ingresar una palabra
    //hasta que ingrese una palabra válida


    do {
        print("Introduze una palabra: ")
        val word = readln()

        val charLetter = word.length - 1
        if(word[0] == word[charLetter]) println(true)
        else println(false)

    }while (word.isNotEmpty())
}