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
    //Define una función llamada suma_numeros_positivos que reciba una lista de
    //números y devuelva la suma de los números positivos. Utiliza "continue" dentro
    //de la función para ignorar los números negativos durante la suma.

    val numbers = listOf(1,2,5,7,8,9,-1,-78,100,345,13)

    fun sumPositiveNumbers(numbs: List<Int>): Int{
        var sum = 0
        for(i in numbs.indices){
            if(numbs[i] < 0) continue
            sum += numbs[i]
        }
        return sum
    }

    println(sumPositiveNumbers(numbers))
}

private fun exerciseTwo(){
    //Crea una función llamada buscar_elemento que reciba una lista y un elemento a buscar.
    //Esta función debería devolver True si el elemento está en la lista y False si no lo está.
    //Utiliza "break" para detener la búsqueda una vez que se encuentre el elemento.

    val numbers = listOf(1,2,5,7,8,9,-1,-78,100,345,13)

    fun searchElement(numbs: List<Int>, element: Int): Boolean{
        var returned = false
        for(i in numbs.indices){
            if(numbs[i] == element){
                returned = true
                break
            }else returned = false
        }
        return returned
    }
    println(searchElement(numbers, 19))
}

private fun exerciseThree(){
    //Escribe una función llamada eliminar_vocales que tome una cadena de texto como
    //argumento y devuelva la misma cadena pero sin ninguna vocal. Utiliza "continue"
    //dentro de la función para evitar agregar las vocales a la cadena resultante.

    fun deleteVocals(texts: String){
        val vocals = listOf('a', 'e', 'i', 'o', 'u')
        var word = " "
        for(i in texts.indices){
            if(vocals.contains(texts[i])) continue
            word += texts[i]
        }
        println(word)
    }
    deleteVocals("skyline")
}

private fun exerciseFour(){
    //Define una función llamada imprimir_numeros_impares que imprima todos los
    //números impares hasta un número dado. Utiliza "continue" dentro de la función
    //para omitir los números pares durante la impresión.

    fun printOddNumbs(numb: Int){
        for(i in 1..numb){
            if(i % 2 == 0) continue
            else println(i)
        }
    }
    printOddNumbs(10)
}

private fun exerciseFive(){
    //Crea una función llamada filtrar_nombres que tome una lista de nombres y un
    //número mínimo de letras como argumentos y devuelva una lista con los nombres que
    //tengan más letras que el número dado. Utiliza "continue" dentro de la función para
    //evitar agregar los nombres que no cumplan con el requisito.

    val names = listOf("raul", "sandra"," bianca", "rosa", "juanmanuel", "pinteracos",
        "julianalvarez", "javi", "slother")

    fun filterNames(names: List<String>, limit: Int): MutableList<String>{
        val newNames = mutableListOf<String>()
        for(i in names.indices){
            if(names[i].length < limit) continue
            else newNames.add(names[i])
        }
        return newNames
    }
    println(filterNames(names, 5))
}

private fun exerciseSix(){
    //Desarrolla una función llamada imprimir_secuencia que imprima una secuencia de
    //números del 1 al 20, pero solo los números impares. Utiliza "continue" dentro de la
    //función para omitir los números pares durante la impresión.

    fun printSequence(){
        for(i in 1..20){
            if (i % 2 == 0) continue
            println(i)
        }
    }
    printSequence()
}

private fun exerciseSeven(){
    //Define una función llamada sumar_pares que tome una lista de números y devuelva
    //la suma de todos los números pares en la lista. Utiliza "continue" dentro de la función
    //para ignorar los números impares durante la suma.

    fun sumPeers(){
        val numbs = listOf(1,2,4,6,8,3,7,99,100,46,13,768,454,222)
        var sum = 0
        for(i in numbs.indices){
            if(numbs[i] % 2 != 0) continue
            sum += numbs[i]
        }
        println(sum)
    }
    sumPeers()
}

private fun exerciseEight(){
    //Crea una función llamada encontrar_mayor que tome una lista de números y
    //devuelva el primer número mayor que 100 en la lista. Utiliza "break" dentro
    //de la función para detener la búsqueda una vez que se encuentre dicho número.

    fun findGreater(){
        val numbs = listOf(1,2,4,6,8,3,7,99,100,46,13,768,454,222)
        for(i in numbs.indices){
            println(numbs[i])
            if(numbs[i] > 100) break
        }

    }
    findGreater()
}

private fun exerciseNine(){
    //Escribe una función llamada calcular_primos que devuelva una lista con los primeros
    //50 números primos. Utiliza "break" dentro de la función para salir del bucle una vez que
    //se hayan encontrado los 50 números primos.


    fun isPrimo(numb: Int): Boolean{
        if(numb < 2) return false

        for(i in 2 until numb){
            if( numb % i == 0)  return false
        }
        return true
    }
    val numbPrimo = mutableListOf<Int>()
    for(i in 1..1234){
        if(isPrimo(i)){
            numbPrimo.add(i)
            println(i)
        }
        if(numbPrimo.size > 50) break
    }
}

private fun exerciseTen(){
    //Define una función llamada calcular_factorial que tome un número como argumento y
    //devuelva su factorial. Utiliza "continue" dentro de la función para evitar multiplicar
    //por 0 y "break" para salir del bucle una vez que se haya calculado el factorial.

    fun calculateFactorial(numb: Int){
        var sum = 1
        for(i in 0..numb){
            if(i == 0) continue
            sum *= i
        }
        println(sum)
    }
    calculateFactorial(6)
}