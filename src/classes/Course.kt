package classes

data class Course(
    val  id : Int,
    val name : String,
    val author : String,
    var courseCategory : CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory{
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main(){
    val course = Course(1, "Reactive Progamming" , "Matheus Werneck");

    println(course)

    val course2 = Course(1, "Reactive Progamming" , "Matheus Werneck");

    val marketingCourse = Course(2, "Facebook Marketing" , "Matheus" , CourseCategory.MARKETING);

    println("Checking object equality : ${course2 == course}")

    println(marketingCourse)

    val copy  = course.copy(id = 5);
}