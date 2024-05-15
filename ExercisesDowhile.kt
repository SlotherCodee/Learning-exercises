import android.os.Build
import androidx.annotation.RequiresApi
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
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
    //Crea una función que pida al usuario ingresar una cadena de caracteres y
    //valide que la cadena contenga al menos una letra y un dígito. La función debe
    //seguir pidiendo al usuario ingresar una cadena hasta que ingrese una cadena válida.

    do {
        print("Ingrese una cadena de caracteres: ")
        val characters = readlnOrNull()
        var digit = 0
        var letter = ' '

        characters?.forEach { c ->
            if(c.isLetter()) letter = c
            if (c.isDigit()) digit = c.digitToInt()
        }

        println(characters)

    }while(characters?.length!! > 2 && characters.contains(digit.toString())
        && characters.contains(letter))

}

@RequiresApi(Build.VERSION_CODES.O)
private fun exerciseTwo(){
    //Crea una función que pida al usuario ingresar una fecha en formato dd/mm/yyyy y valide que la
    //fecha sea válida. La función debe seguir pidiendo al usuario ingresar una fecha hasta
    //que ingrese una fecha válida.



    do {
        print("Ingrese una fecha: ")
        val date = readln()
        var p = ""
        try {

            val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(date)
            p = formatter.toString().reversed()
        }catch (e: DateTimeParseException){
            println("Error en el formato de la fecha, introduzca fecha en formato dd/MM/yyyy")
        }


    }while(date != p)


}

private fun exerciseThree(){
    //Crea una función que pida al usuario ingresar un número entero y devuelva true si el
    //número es un número primo, y false en caso contrario. La función debe seguir pidiendo al
    //usuario ingresar un número hasta que ingrese un número válido.


    do {
        print("Introduzca un numero entero: ")
        val numb = readln()

        if(numb.toInt() % numb.toInt() == 0 && numb.toInt() % 2 != 0){
            println("Numero primo " + false)
        }else{
            println("Numero primo " + true)
        }


    }while(numb.isBlank())
}

private fun exerciseFour(){
    //Crea una función que pida al usuario ingresar un número entero y
    //devuelva el número de dígitos que tiene. La función debe seguir pidiendo
    //al usuario ingresar un número hasta que ingrese un número válido.


    do {
        print("Ingrese un numero: ")
        val numb = readln()
        var countDigit  = 0

        numb.forEach { _ ->
            countDigit += 1
        }

        println("Numero de digitos $countDigit")

    }while(numb.isNotEmpty())
}

private fun exerciseFive(){
    //Crea una función que pida al usuario ingresar una palabra y devuelva el número de vocales
    //que tiene. La función debe seguir pidiendo al usuario ingresar una palabra hasta que ingrese
    //una palabra válida.


    do {

        print("Ingrese una palabra: ")
        val word = readln()
        val vocals = listOf('a', 'e', 'i', 'o', 'u')
        var countVocal = 0
        var containsVocal = false

        vocals.forEach { v ->
            if(word.contains(v)){
                countVocal += 1
                containsVocal = true
            }
        }
        println("Palabra $word contiene $countVocal vocales")

        if(!containsVocal) println("Por favor introduzca una palabra valida")

    }while (word.isNotBlank())
}

private fun exerciseSix(){
    //Crea una función que pida al usuario ingresar una cadena de caracteres y
    //devuelva true si la cadena es un email válido, y false en caso contrario.
    //La función debe seguir pidiendo al usuario ingresar una cadena hasta que ingrese una
    //cadena válida.

    do {

        print("Introduzca su email: ")
        val email = readln()

        val contain = "@" + email.substringAfter('@')
        if(email.contains(contain)) {
            println("Correo valido ${true}")
        }

        else println("${false} Por favor escriba un correo valido, ejemplo@gmail.com")

    }while (email.isNotBlank())
}

private fun exerciseSeven(){

    //Crea una función que pida al usuario ingresar una palabra y devuelva true si la
    //palabra es una palabra reservada de Kotlin, y false en caso contrario. La función
    //debe seguir pidiendo al usuario ingresar una palabra hasta que ingrese una palabra válida.


    do{
        print("Introduzca una palabra: ")
        val word = readln()

        val reservedKeys = listOf("as", "break", "class", "do", "else", "false")

        if(reservedKeys.contains(word)) println("$word es una palabra reservada ${true}")
        else println("$word es una palabra normal ${false}")


    }while(word.isNotBlank())
}

private fun exerciseEight(){
    //Crea una función que pida al usuario ingresar una palabra y devuelva true si la
    //palabra es una palabra clave de Kotlin, y false en caso contrario. La función debe seguir
    //pidiendo al usuario ingresar una palabra hasta que ingrese una palabra válida.

    do {
        print("Introduzca una palabra: ")
        val word = readln()

        val keyword = listOf( "by", "catch", "constructor", "delegate")

        if(keyword.contains(word)) println("$word es una palabra clave de kotlin ${true}")
        else println("Es otra palabra $word ${false}")

    }while (word.isNotBlank())

}