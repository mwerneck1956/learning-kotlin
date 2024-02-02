package classes

open class User(val name : String) {
    open var isLoggedIn : Boolean = false;

    open fun login(){
        println("Inside user login")
    }

    private fun secret(){

    }

    protected fun logout(){

    }
}


class Student(name : String) : User(name) {
    override  var isLoggedIn = true;

    companion object{
        fun country() = "USA"
    }

    override fun login(){
        println("Inside student login")
        super.login()
    }
}

class Instructor(name : String) : User(name){

}

fun main(){


    val student = Student("Alex")
    println("Name is : ${student.name}")

    student.login()
    println("Country is ${Student.country()}")

    val instructor = Instructor("Dilip")

    instructor.login()
}
