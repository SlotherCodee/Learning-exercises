class Operations(private val suma: String = "+",
                 private val rest: String = "-",
                 private val multi: String = "*",
                 private val division: String = "/") {


    fun getSuma(one: Int, two: Int): Int{
        return one + two
    }
    fun getRest(one: Int, two: Int): Int{
        return one - two
    }
    fun getMulti(one: Int, two: Int): Int{
        return one * two
    }
    fun getDivision(one: Int, two: Int): Int{
        return one / two
    }

}