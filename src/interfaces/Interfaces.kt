package interfaces
import classes.Course

interface CourseRepository{
    var isCoursePersisted : Boolean;
    fun getById(id : Int) : Course

    fun save(course : Course) : Int{
        println("Course : $course")

        return course.id;
    }
}


class SqlCourseRepository : CourseRepository{
    override var isCoursePersisted: Boolean = false;

    override fun save(course: Course): Int {
        isCoursePersisted  = true;
        return super.save(course)
    }
    override fun getById(id : Int): Course {
        return Course(1 , "Kotlin Course" , "Dilip");
    }
}


class NoSqlRepository : CourseRepository{
    override var isCoursePersisted: Boolean = false;

    override fun getById(id: Int): Course {
        return Course(1 , "Kotlin Course" , "Dilip");
    }
}

interface A {
    fun doSomething(){
        println("do Something in A")
    }
}

interface  B {
    fun doSomething(){
        println("doSomething in B")
    }
}

class AB : A , B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in A,B")
    }
}

fun main(){
    val sqlCourseReposity = SqlCourseRepository();
    val course = sqlCourseReposity.getById(1);

    val noSqlCourseReposity = NoSqlRepository();
    val course2 = noSqlCourseReposity.getById(1);

    sqlCourseReposity.save(course);

    noSqlCourseReposity.save(course2)

    var ab = AB();

    ab.doSomething()
}