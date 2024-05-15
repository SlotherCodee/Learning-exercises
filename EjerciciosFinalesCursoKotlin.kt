fun main() {
    //exerciseOne()
    //exerciseTwo()
    //exerciseThree()
    //exerciseFour()
    exerciseFive()
}

private fun exerciseOne(){
    //Usa un bucle do-while para mostrar por pantalla una cuenta regresiva
    //del 9 al 0 igual que cuando hay un lanzamiento de un cohete por parte de la NASA
    var despegue = 9
    println("Cuenta atras para el lanzamiento:")
    do{
        println(despegue)

        despegue--

    }while(despegue >= 0)
    println("Cochete ha despegado con exito")
}

private fun exerciseTwo(){
    //Usa un bucle while para recorrer todos los números del 1 al 10
    //y mostrar únicamente los pares

    var num = 1
    while(num <= 10){

        if(num % 2 == 0) println("Num par: $num")
        num += 1
    }
}

private fun exerciseThree(){
    //Usa un bucle for para recorrer un array en el que estén almacenados
    //los diferentes platos que ofrece un restaurante y mostrarlos por pantalla

    val restaurant: Array<String> = arrayOf("Spaghetti carbonara", "Entrecot de buey",
        "Gambas al ajillo", "Pato a la naranja")

    println("Menu de hoy:")
    for(i in restaurant){
        println("  *$i")
    }

}

private fun exerciseFour(){
    //Crea el mismo ejercicio de antes pero ahora con un array de conjuntos de datos
    //Cada elemento del array debe contener el nombre del plato y su precio

    val restaurant: Map<String, Int> = mapOf(
       "Spaghetti carbonara" to 15,
       "Entrecot de buey" to 50
    )
    for(i in restaurant.entries){
        println("Plato: ${i.key} Precio: ${i.value} €")
    }
}

private fun exerciseFive(){
    //Crea el mismo ejercicio de antes pero añadiendo a cada conjunto de datos un
    //array con los ingredientes de cada plato
    //Ahora deberiamos tener la siguiente información de cada elemento del array
    //principal: plato, precio, lista de ingredientes

    val restaurant = arrayOf(
        arrayOf( "Spaghetti carbonara", 15, arrayOf("pasta", "salsa carbonara")),
        arrayOf("Entrecot de buey", 50, arrayOf("carne de buey", "salsa barbacoa"))
    )

    for(i in restaurant.indices){
        val arrayTwo = restaurant[i][2] as Array<*>
        println("Plato: ${restaurant[i][0]} Precio: ${restaurant[i][1]}€ Ingredientes: ")
        for(j in arrayTwo){
            println("  * $j")
        }
    }
}