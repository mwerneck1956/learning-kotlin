package basics


fun main(){
    //if-else

    var name = "Alex"

    name = "Chloe";

    var result = if(name.length == 4){
        println("Name is four Characters")
        name
    }else{
        println("Name is not four characters")
        name
    }

    println("result : $result")


    var x = 10;

    when(x){
        1  -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 or 2")
        }
    }
}