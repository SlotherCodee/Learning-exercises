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
}

private fun exerciseOne(){

    val studentOne = Student("Nicolas", "Gomez", "4616374F", 5.5)
    val studentTwo = Student("Maria", "Rubia", "757452D", 10.0)
    val studentThree = Student("Pablo", "Tupe", "01939434U", 2.1)
    val studentFour = Student("Carla", "Sancho", "816534T", 7.4)

    val students: List<Student> = listOf(studentOne, studentTwo, studentFour, studentThree)

    var media  = 0.0
    for(i in students.indices){
        media += students[i].getNote()

       if(students[i].getNote() < 5)
           println("${students[i].getName()} esta suspenso")
       else if(students[i].getNote() < 6)
           println("${students[i].getName()} ha sacado un suficiente")
       else if(students[i].getNote() < 7)
           println("${students[i].getName()} ha sacado un bien")
       else if(students[i]. getNote() < 8)
           println("${students[i].getName()} ha sacado un notable")
       else
           println("${students[i].getName()} ha sacado sobresaliante o excelente")

    }

    println("La nota media de los alumnos es: ${media / students.size}")
}

private fun exerciseTwo(){

    print("Introduce caracteres: ")
    val character = readln()

    val numb = character.filter { f -> f.isDigit() }
    if(numb.isEmpty())
        println("$character no es un numero")
    else
        println("$numb es un numero")

}

private fun exerciseThree(){
    print("Introduce caracteres: ")
    val character = readln()

    if(character.contains("."))
        println("$character no es un numero")
    else
        println("$character es un numero")
}

private fun exerciseFour(){

    //Problem 1: Se ingresan tres notas de un alumno,
    //si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
    var count = 0
    var sum = 0.0

    while(count < 3){
        print("Ingrese una nota: ")
        val note = readln().toDouble()
        sum += note
        count += 1
    }

    if((sum / 3) >= 7)
        println("Promocionado")
    else
        println("Lo siento no esta promocionado")


    //Problem 2: Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un
    //mensaje indicando si el número tiene uno o dos dígitos.
    //(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
    println("Introduce un numero entre 1 y 99: ")
    val num = readln().toInt()

    if(num < 10)
        println("$num tiene un digito")
    else
        println("$num tiene dos digitos")
}

private fun exerciseFive() {
    //Cargar un valor entero por teclado comprendido entre 1 y 99.
    //Almacenar en otra variable la cantidad de dígitos que tiene el valor ingresado por teclado.
    //Mostrar la cantidad de dígitos del número ingresado por teclado.


    print("Ingrese numero entre 1 y 99: ")
    val number = readln().toInt()

    return if (number < 10) println("$number tiene 1 digito")
    else println("$number tiene dos digitos")
}

private fun exerciseSix(){
    //Implementar una clase llamada Alumno que tenga como propiedades su nombre y su nota.
    //Definir los métodos para inicializar sus propiedades por teclado, imprimirlos y mostrar
    //un mensaje si está regular (nota mayor o igual a 4)
    //Definir dos objetos de la clase Alumno.

    var count = 0
    while(count < 2){

        print("Nombre alumno: ")
        val name = readln()
        print("Apellidos alumno: ")
        val lastname = readln()
        print("Dni alumno: ")
        val dni = readln()
        print("Nota alumno: ")
        val note = readln().toDouble()

        val students = Student(name, lastname, dni, note)

        if(students.getNote() >= 4) println("Esta regular")
        else println("Va sobrado")
        count += 1
    }

}

private fun exerciseSeven(){
    //Confeccionar un programa que lea n pares de datos, cada par de datos corresponde
    //a la medida de la base y la altura de un triángulo. El programa deberá informar:

    //a) De cada triángulo la medida de su base, su altura y su superficie
    //(la superficie se calcula multiplicando la base por la altura y dividiendo por dos).

    //b) La cantidad de triángulos cuya superficie es mayor a 12.

    for(i in 0..5){
        print("Introduce un numero: ")
        val base = readln().toInt()
        print("Introduce el segundo numero: ")
        val altura = readln().toInt()

        val calculate = (base * altura) / 2

        if(calculate > 12)
            println("Trinagulo $i superficie $calculate")
        else
            println("El triangulo $i tiene superficie menor a 12")
    }
}

private fun exerciseEight(){
    //Realizar un programa que lea los lados de n triángulos, e informar:
    //a) De cada uno de ellos, qué tipo de triángulo es: equilátero
    //(tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
    //b) Cantidad de triángulos de cada tipo.


    for(i in 1..6){
        print("Number one: ")
        val one = readln().toInt()
        print("Number two: ")
        val two = readln().toInt()
        print("Number three: ")
        val three = readln().toInt()

        when{
            one == two && two == three -> println("El triangulo $i es equilatero")
            one == two && two != three -> println("El triangulo $i es isosceles")
            else -> println("El trinagulo $i es escaleno")
        }

    }
}

private fun exerciseNine(){
    //Realizar la carga de la cantidad de hijos de 10 familias.
    //Contar cuantos tienen 0,1,2 o más hijos. Imprimir dichos contadores.

    var childrenZero = 0
    var childrenOne = 0
    var childrenTwo = 0
    var other = 0

    for(i in 1..10){
        print("Introduce numero de hijos: ")
        val children = readln().toInt()

        when(children){
            0 -> childrenZero += 1
            1 -> childrenOne += 1
            2 -> childrenTwo += 1
            else -> other += 1
        }
    }
    println("$childrenZero familias tienen 0 hijos")
    println("$childrenOne familias tienen 1 hijo")
    println("$childrenTwo familias tienen dos hijos")
    println("$other familias tienen mas de dos hijos")
}