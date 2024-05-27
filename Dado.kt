open class Dado(var number: Int = 0) {
    
    fun initialize(){
        this.number = (1..6).random()
    }

    fun print(){
        println(this.number)
    }
}

class DadoBox(number: Int): Dado(number){

     fun printAsterisks(){
        for(i in 1..number) print("*")
    }
}