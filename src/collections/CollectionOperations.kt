package collections

import dataset.Course
import dataset.CourseCategory
import dataset.courseList


fun main() {
    val coursesList = courseList();

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }

    //exploreFilter(coursesList , devPredicate);
    //exploreMap(coursesList, devPredicate)

    //val list = listOf((listOf(1,2,3)) , listOf(4,5,6))

    /*val mapResult = list.map { outerList ->
        outerList.map{
            it.toDouble()
        }
    }

     */


    /*println("mapResult : $mapResult")

    val flatMapResult = list.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }

    println("flatMapResult : $flatMapResult")

   exploreFlatMap(coursesList, KAFKA)
   */

    //exploreHashMap();

    collections_nullability()

}


fun collections_nullability(){
    var list : MutableList<String>? = null;

    list = mutableListOf();
    list.add("Dilip");

    list?.forEach{
        println("Values is $it")
    }

    val list1 : List<String?> = listOf("Adam" , null , "Alex");

    list1.forEach{
        println("Value is ${it?.length}")
    }
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Dilip" to 33, "Scooby" to 5);

    nameAgeMutableMap.forEach { (key, value) ->
        println("Key : $key and the value is $value")
    }

    val value = nameAgeMutableMap.getOrElse("Dilip1") { "abc" };
    println("Val is $value");

    val result = nameAgeMutableMap.containsKey("abc")

    val filteredMap = nameAgeMutableMap.filterKeys { it.length > 5 }
        .map { it.key.uppercase() }

    println("Filtered map is $filteredMap")

    val maxAge = nameAgeMutableMap.maxByOrNull { it.value }

    println("MaxAge is $maxAge")
}

fun exploreFlatMap(coursesList: MutableList<Course>, kafka: String) {
    val kafkaCourse = coursesList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter { it == kafka }.map {
            courseName
        }
    }

    println(kafkaCourse)
}

fun exploreMap(coursesList: MutableList<Course>, devPredicate: (Course) -> Boolean) {
    val courses = coursesList.map { "${it.name} - ${it.category}" }


    println("Courses : $courses")
}

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val developmentCourses = courseList.filter { predicate.invoke(it) }.forEach {
        println("development Course : $it")
    }
}
