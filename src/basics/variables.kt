package basics


fun main() {
    val name: String = "Matheus"
    println(name)

    var age: Int = 23;
    println(age)

    age = 34;
    println(age)

    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"

    println("Course : $course and the length is");

    val num = topLevelFunction();
    println("Num is : $num")
    println("courseName : $courseName")
}