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
    //Crea una función llamada filtrar_positivos que reciba una lista de números y utilice una
    //expresión lambda junto con la función filter para filtrar solo los números positivos.

    val numbers = listOf(2,-1,3,5,6,7,8,-9,-8-4,10)


    fun filterPositive(numbs: List<Int>){
        val list = numbs.filter { nmb ->
            nmb > 0
        }
        println(list)
    }

    filterPositive(numbers)
}

private fun exerciseTwo(){
    //Define una función llamada doble que tome una lista de números y
    //utilice una expresión lambda junto con la función map para devolver
    //una lista con el doble de cada número.

    val numbers = listOf(2,3,5,6,7,8,9,84,10)

    fun double(numb: List<Int>){
        val d =numb.map { n ->
             n * 2
        }
        println(d)
    }
    double(numbers)
}

private fun exerciseThree(){
     //Escribe una función llamada invertir_cadena que tome una cadena de texto y
    //utilice una expresión lambda junto con el método join para devolver la cadena invertida.

     print("Introduce un texto: ")
     val word = readln()

     fun reversedText(text: String){
        println(text.reversed())
     }

     reversedText(word)
}

private fun exerciseFour(){
    //Desarrolla una función llamada filtrar_impares que tome una lista de números y
    //utilice una expresión lambda junto con la función filter para filtrar solo los
    //números impares.

    val numbers = listOf(2,3,5,6,7,8,9,84,10,43,14,17,29,31,33)

    fun filterOddNumbers(numbs: List<Int>){
        val numb = numbs.filter { n ->
            n % 2 != 0
        }
        println(numb)
    }
    filterOddNumbers(numbers)

}

private fun exerciseFive(){
    //Crea una función llamada mayor_a_100 que tome una lista de números y utilice
    //una expresión lambda junto con la función filter para devolver solo los números
    //mayores que 100.

    val numbers = listOf(211,3,5,613,711,8,9,841,10,43,145,17,292,31,33)

    fun greaterOneHundred(numbs: List<Int>){
        val filters = numbs.filter { n ->
            n > 100
        }
        println(filters)
    }
    greaterOneHundred(numbers)
}

private fun exerciseSix(){
    //Define una función llamada sumar_elementos que tome una lista de números y utilice
    //una expresión lambda junto con la función reduce para devolver la suma de todos los
    //elementos.

    val numbers = listOf(2,4,6,7,9,10,24,56,78,33,31,83,99)

    fun sumElements(numbs: List<Int>){
        val sum = numbs.reduce { accumulator, i ->
            accumulator + i
        }
        println(sum)
    }
    sumElements(numbers)
}

private fun exerciseSeven(){
    //Escribe una función llamada contar_vocales que tome una cadena de texto y utilice
    //una expresión lambda junto con la función filter para contar el número de vocales
    //en la cadena.

    val vocals = listOf('a', 'e', 'i', 'o', 'u')

    fun countVocals(text: String){
        val count = text.filter { c ->
            vocals.contains(c)
        }
        println(count)
    }

    countVocals("albaricoque")
}

private fun exerciseEight(){
    //Desarrolla una función llamada eliminar_duplicados que tome una lista y utilice
    //una expresión lambda junto con la función set para eliminar los elementos duplicados
    //y devolver una lista sin duplicados.

    val numbers = listOf(1,2,3,6,7,8,1,2,3,9,100,24,100,64,53453)

    fun deleteDuplicate(numbs: List<Int>){
        val delete = numbs.toSet()
        println(delete)
    }
    deleteDuplicate(numbers)
}

private fun exerciseNine(){
    //Crea una función llamada encontrar_menor que tome una lista de números y utilice una
    //expresión lambda junto con la función min para encontrar el número menor en la lista.

    val numbers = listOf(1,2,3,6,7,8,1,2,3,9,100,24,100,64,53453)

    fun searchMinor(numbs: List<Int>){
        val minor = numbs.min()
        println(minor)
    }
    searchMinor(numbers)
}

private fun exerciseTen(){
    //Define una función llamada calcular_promedio que tome una lista de números y
    //utilice una expresión lambda junto con la función sum y len para calcular el
    //promedio de los elementos.

    val numbers = listOf(1,2,3,6,7,8,1,2,3,9,100,24,100,64,53453)
    fun calculateAverage(numbs: List<Int>){
        val average = numbs.sum() / numbs.size
        println(average)
    }
    calculateAverage(numbers)
}