package classes

class Item {
    var name : String = ""
    var price : Double = 0.0

        get() {
            println("Inside getter")
            return field
        }
        set(value){
            if(value >= 0.0){
                field = value
            }else{
                throw IllegalArgumentException("Negative price in not allowed")
            }
        }

    constructor(_name : String) {
        name = _name
    }
}

fun main(){
    val item = Item("Iphone");

    item.price = 0.5;

    println(item.name)
}