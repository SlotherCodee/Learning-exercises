fun main() {
    //exerciseEleven()
    //exerciseTwelve()
    //exerciseThirteen()
    //exerciseFourteen()
    //exerciseFifteen()
    //exerciseSixteen()
    //exerciseSeventeen()
    //exerciseEighteen()
}

private fun exerciseEleven(){
    //Dado una matriz de enteros, escribe un código que imprima solo los elementos
    //de la matriz que sean múltiplos de 3 y no de 5. Si encuentra un elemento que
    //sea múltiplo de 2, debe terminar de iterar sobre la matriz.

    val numbers = listOf(1,7,9,45,67,23,2,6,40,111,78,91,10)

    for (i in numbers.indices){
        if(numbers[i] % 3 == 0 && numbers[i] % 5 != 0) println(numbers[i])
        if(numbers[i] % 2 == 0) break
    }
}

private fun exerciseTwelve(){
    //Dado una lista de objetos de una clase personalizada que tienen una propiedad
    //"nombre" y una propiedad "edad", escribe un código que imprima solo los objetos
    //cuyo nombre tenga más de 5 caracteres y cuyo edad sea mayor a 20. Si encuentra un
    //objeto cuyo nombre tenga menos de 3 caracteres, debe continuar con la siguiente iteración.

    val p1 = Person(22, "Gandul")
    val p2 = Person(24, "Maria")
    val p3 = Person(18, "Jose")
    val p4 = Person(27, "Armin")

    val persons = listOf(p1, p2, p3, p4)

    for (i in persons.indices){
        if(persons[i].name.length > 5 && persons[i].age > 20) println(persons[i].name)
        if(persons[i].name.length < 4) continue
    }

}

private fun exerciseFourteen(){
    //Dado una matriz de enteros, escribe un código que imprima solo los elementos
    //de la matriz que sean múltiplos de 3 y no de 5, y que también sean mayores a
    //10 y menores a 20. Si encuentra un elemento que cumpla con todas estas condiciones
    //y además sea múltiplo de 2, debe terminar de iterar sobre la matriz.
    val numb = listOf(7,9,53,12,41,61,83,66,33,90,100)

    for(i in numb.indices){
        if(numb[i] % 3 == 0 && numb[i] % 5 != 0 && numb[i] > 10 && numb[i] < 20){
            println(numb[i])
            if(numb[i] % 2 == 0) break
        }
    }
}

private fun exerciseFifteen(){
    //Dado una lista de números enteros, escribe un código que sume solo los números pares.
    //Si encuentra un número impar, debe terminar de iterar sobre la lista.

    val numb = listOf(2,4,6,8,10,13, 20)
    var sum = 0

    for(i in numb.indices){
        if(numb[i] % 2 == 0) sum += numb[i]
        else break
    }
    println("Suma toal $sum")
}

private fun exerciseSixteen(){
    //Dado una lista de cadenas de texto, escribe un código que imprima solo aquellas
    //que comiencen con la letra 'a' y tengan más de 3 caracteres. Si encuentra una cadena
    //que no cumpla con estas condiciones, debe terminar de iterar sobre la lista.

    val words = listOf("avellana", "andres", "anastasia", "caca", "abuela")
    for(i in words.indices){
        if(words[i].lowercase().startsWith('a') && words[i].length > 3) println(words[i])
        else break
    }
}

private fun exerciseSeventeen(){
    //Dado una lista de objetos de una clase personalizada que tienen una propiedad "nombre" y
    //una propiedad "edad", escribe un código que imprima solo los objetos cuyo nombre comience con
    //la letra 'a' y cuyo edad sea mayor a 20. Si encuentra un objeto cuyo nombre comience con la
    //letra 'b', debe terminar de iterar sobre la lista.

    val p1 = Person(21, "Andrea")
    val p2 = Person(25, "Alejandra")
    val p3 = Person(200, "Bruno")
    val p4 = Person(32, "Alba")

    val p = listOf(p1,p2,p3,p4)

    for(i in p.indices){
        if(p[i].name.lowercase().startsWith('a') && p[i].age > 20) println(p[i].name)
        if(p[i].name.lowercase().startsWith('b')) break
    }
}

private fun exerciseEighteen(){
    //Dado una lista de números enteros, escribe un código que imprima solo los
    //números primos. Si encuentra un número que no es primo, debe continuar con la
    //siguiente iteración.

    val numbers = listOf(3,5,7,11,13,21)

    for(i in 2 until numbers.size){
        if(numbers[i] < 2) break
        if(numbers[i] % i == 0) break
        else println(numbers[i])
    }
}