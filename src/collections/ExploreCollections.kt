package collections

fun main(){
    val names = listOf("Alex" , "Ben" , "Chloe")
    println(names)

    var namesMutable = mutableListOf("Alex" , "Ben" , "Chloe")
    namesMutable.add("Adam");

    println("Names : $namesMutable")

    val set = setOf("Alex" , "Ben" , "Chloe")
    println("set : $set")


    val mutableSet = mutableSetOf("Alex" , "Ben" , "Chloe")
    mutableSet.add("Matheus")
    println("Mutable set after : $mutableSet")

    val nameAgeMap = mapOf("Matheus" to 23, "Scooby" to 4);
    println("Name age map $nameAgeMap")

    val nameAgeMutableMap = mutableMapOf("Matheus" to 23, "Scooby" to 4);
    nameAgeMutableMap["abc"] = 100

    println("nameAgeMutalbe : $nameAgeMutableMap")
}