package scopeFunctions
import classes.Course
import classes.CourseCategory

fun main(){
    exploreLet()
}

fun exploreApply(){
   val course = Course(
        1,
        "Design thinking in Kotlin",
        "Dilip",
    ).apply {
        courseCategory = CourseCategory.DESIGN
    }

    println(course)
}

fun exploreLet(){
    val numbers = mutableListOf(1,2,3,4,5);

    val result = numbers.map{
        it * 2
    }.filter {
        it > 5
    }.let {
        println(it)
        it.sum()
    }

    print(result)

    var name : String? = null;

    name?.let{

    }
}

fun exploreAlso(){
    val course = Course(
        1,
        "Design thinking in Kotlin",
        "Dilip",
    ).also {
        //it.courseCategory = CourseCategory.DESIGN

        println("Course is $it")
    }

    println(course)
}

