package cast

import classes.Course

fun main(){
    val course = Course(1, "Kotlin" , "Dilip");

    checkType(course)
    checkType("Dilip")


    castNumber(1.0);
    castNumber(1);
}

fun castNumber(any : Any){
   when(any){
       any as Double -> println("Value is double")
   }
}

fun checkType(type : Any){
    when(type){
        is Course -> {

            println(type)
        }
        is String -> {
            print(type.lowercase())
        }
    }
}