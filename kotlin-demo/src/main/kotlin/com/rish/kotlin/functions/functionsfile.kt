package com.rish.kotlin.functions

import java.time.LocalDate

fun main()
{
    printName("rishabh")
    var result=addition(3,4)
    println(result)
    printPersonDetails("rishabh")
}

fun addition(i: Int, i1: Int) :Int{
return i+i1;
}
fun printPersonDetails(name:String,email:String="",dob:LocalDate=LocalDate.now()){

println("name is $name and email is $email and the date $dob")
}
fun printName(name:String)
{
    println("Name is $name")
}