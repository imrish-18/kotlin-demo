package com.rish.kotlin.functions

    fun main(){
        // variables declared with val are immutable
        val  name:String = "rishabh"
        // name="sharma" Val cannot be reassigned
        var age:Int=12
        // var are not immutable
        age=16
        val hobbies="cricket..."
        var score=1290
        println("hello ${name.length} and the age is $age and hobbies is $hobbies and score is $score")
    }
