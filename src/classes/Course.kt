package classes

data class Course(
    val  id : Int,
    val name : String,
    val author : String
)

fun main(){
    val course = Course(1, "Reactive Progamming" , "Matheus Werneck");

    println(course)

    val course2 = Course(1, "Reactive Progamming" , "Matheus Werneck");

    println("Checking object equality : ${course2 == course}")

    val copy  = course.copy(id = 5);
}