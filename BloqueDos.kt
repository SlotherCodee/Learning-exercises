fun main() {
    //exerciseOne()
    //exerciseTwo()
    exerciseThree()
}

private fun exerciseOne(){
    //Desarrollar un programa con dos funciones. La primer solicite el ingreso de un
    //entero y muestre el cuadrado de dicho valor. La segunda que solicite la carga de
    //dos valores y muestre el producto de los mismos. LLamar desde la main a ambas funciones.


    fun solicitar(){
        print("Introduce un entero: ")
        val number = readln().toInt()
        println(number * number)
    }

    fun twoNumbers(){
        print("Number one: ")
        val one = readln().toInt()
        print("Number two :")
        val two = readln().toInt()

        println(one * two)
    }

    solicitar()
    twoNumbers()
}

private fun exerciseTwo(){
    //Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
    //El valor acumulado de todos los elementos.
    //El valor acumulado de los elementos que sean mayores a 36.
    //Cantidad de valores mayores a 50.
    //(Definir dos for, en el primero realizar la carga y en el segundo
    //proceder a analizar cada elemento)

    //Option 1
    val array = intArrayOf(1,4,7,9,4,1,37,81)
    var count = 0
    println("Valor acumulado: ${array.sum()}")
    array.forEach { i ->
       if (i > 36) count += i
    }
    println("Valor acumulado elementos mayor a 36: $count")
    val total = array.count { n -> n > 50 }
    println("Elementos mayores a 50: $total")


    //Option statement
    val intArray = IntArray(8)
    for(i in intArray.indices){
        print("Introduce numero: ")
        intArray[i] = readln().toInt()
    }

    var accumulate = 0
    var counts = 0
    var up50 = 0
    for(i in intArray.indices){
        accumulate += intArray[i]

        if( intArray[i] > 36 && intArray[i] > 50){
            counts += intArray[i]
            up50 += 1
        }else if(intArray[i] in 37..49)
            counts += intArray[i]
    }
    println("Valor acumulado: $accumulate")
    println("Valor acumulado elementos mayor a 36: $counts")
    println("Elementos mayores a 50: $up50")
}

private fun exerciseThree(){
    //Declarar una clase Dado que genere un valor aleatorio entre 1 y 6, mostrar su valor.
    //Crear una segunda clase llamada DadoRecuadro que genere un valor entre 1 y 6,
    //mostrar el valor recuadrado en asteríscos.
    //Utilizar la herencia entre estas dos clases.

    val dado = Dado()
    dado.initialize()
    dado.print()
    val dadoBox = DadoBox(0)
    dadoBox.initialize()
    dadoBox.print()
    dadoBox.printAsterisks()
}