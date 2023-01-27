package com.rish.kotlin.functions

fun main(){

    val range=1..10

//    for(i in range) {
//        println(i)
//    }
    val reverseRange=10 downTo 1
    for( i in reverseRange step 3) // skip value in iteration
        println(i)

    var list= mutableListOf(1,2,3)
    var lis1= listOf(6,7,8)
    list.add(5)
    for(item in list)
        println(item)
}

