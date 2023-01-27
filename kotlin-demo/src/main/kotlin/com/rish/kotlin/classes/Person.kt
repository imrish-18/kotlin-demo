package com.rish.kotlin.classes

class Person(private val name:String="",
             val id:Int=1) {
// primary constructor
    fun action(){
        println("hello rishabh sharma$name")
    }
    fun disp()= println("hello....")
}

fun main(){
    val person=Person("rishabh",1)

    val person1=Person()

    person1.action()

    person.action()
    person.disp()

}