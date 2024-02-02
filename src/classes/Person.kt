package classes

class Person(val name : String = "", val age: Int = 0) {

    var nameLength : Int = 0;
    fun action(){
        println("Person Walks")
    }

    init {
        println("Inside init block")
        nameLength = name.length
    }
}

fun main(){
    val person = Person("Matheus" , 23);
    person.action()
    println("Name : ${person.name} and the age is ${person.age}, ${person.nameLength}")
}