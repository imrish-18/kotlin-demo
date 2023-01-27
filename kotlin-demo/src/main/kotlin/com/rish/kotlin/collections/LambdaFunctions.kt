package com.rish.kotlin.collections

fun main(){
    val addLambda={x:Int->x+x}
    val addResult=addLambda(3)
    println(addResult)

    val multiPlyLambda={x:Int,y:Int->
        println("value of x is $x and value of y is $y")
        x*y
    }
    val multiplyResult=multiPlyLambda(2,3)
    println(multiplyResult)
    val result= calculate(2,4) { a, b -> a * b }
    println(result)
}

fun calculate(x:Int,y:Int,op:(x:Int,y:Int)->Int):Int{
    return op(x, y)
}