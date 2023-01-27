package com.rish.kotlin.variables

class RangeAndLoops {
}
fun main(){
    val range=1..10
    for(i in range)
        println(i);
    val reverseRange= 10 downTo 1
    for(i in reverseRange step 2)
        println("printing value with skipping value 2 and value is $i")
val result= listOf(1,2,3,4,5).forEach(){
    println(it)
if(it==3)return@forEach
}
    println(result)
}