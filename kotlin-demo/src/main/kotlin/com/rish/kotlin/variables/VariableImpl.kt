package com.rish.kotlin.variables

class VariableImpl {
}
fun main(){
    val name="rishabh"
    println(name)
    // name="sharma" here val is not mutable so use var
    var age=23;
    println("age ${age.toChar()}")
    age=45
    println(age)
}