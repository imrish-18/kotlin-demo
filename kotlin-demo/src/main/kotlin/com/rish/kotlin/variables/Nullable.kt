package com.rish.kotlin.variables

fun main(){
    val nameNullable: String? =null
    println(nameNullable?.length) // safe operator
    val length=nameNullable?.length?:0// elvis operator
    println(length)
}