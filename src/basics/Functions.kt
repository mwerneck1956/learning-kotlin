package basics

import java.time.LocalDate

fun printPersonDetails(name : String, email : String = "" , dob : LocalDate = LocalDate.now()){
    println("Name is $name and email is $email and the dob is $dob")
}


fun main(){
    printPersonDetails("Matheus" , "abc@gmail.com" , LocalDate.parse("2000-01-01"));
    printPersonDetails(name = "Matheus")
}