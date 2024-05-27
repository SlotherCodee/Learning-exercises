class Student(private var name: String, private var lastName: String,
    private var dni: String, private var note: Double) {


    fun getName(): String{
        return this.name
    }

    fun getLastName(): String{
        return this.lastName
    }

    fun getDni(): String{
        return this.dni
    }

    fun getNote(): Double{
        return this.note
    }
}