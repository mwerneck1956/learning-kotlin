package nulls

data class Movie(
    val id : Int?,
    val name : String)



fun printName(name : String){
    println("Name is : $name")
}

fun main(){
    var nameNullable : String? = null

    nameNullable?.run{
        printName(this)
    }

    nameNullable = "Matheus"

    println(nameNullable)

    var name : String = "Matheus"

    val movie = Movie(null,  "Avengers")
    val savedMovie = saveMovie(movie)


    println("Saved movie : $savedMovie")
}

fun saveMovie(movie : Movie) : Movie {
    return movie.copy()
}
