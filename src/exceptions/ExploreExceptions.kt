package exceptions

fun returnNothing() : Nothing {
    throw RuntimeException("Exception")
}

fun main() {
    println("Name lenght ${nameLenght("Dilip")}")

    println("Name lenght ${nameLenght(null)}")

    returnNothing()
}

fun nameLenght(name: String?): Int? {
    return try {
        name!!.length
    } catch (ex: Exception) {
        println("Exception is $ex")

        null;
    }

}