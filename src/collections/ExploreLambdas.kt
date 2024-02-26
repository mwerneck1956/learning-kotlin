package collections

fun calculate(x : Int, y : Int , op : (x : Int, y : Int) -> Int) : Int{
    return op(x,y);
}


fun main(){
    val addLambda = { x : Int -> x + x }

   val addResult = addLambda(4)

   println("addResult :  $addResult")

    val multiplyLambda = {x : Int, y : Int ->
        println("x is $x and y is $y")
        x * y}

    val multiplyResullt = multiplyLambda(2,3);
    println("Multiply result  $multiplyResullt")

    val result = calculate(10 , 20 , {a, b ->  a  * b});
    println("Result is $result")

}