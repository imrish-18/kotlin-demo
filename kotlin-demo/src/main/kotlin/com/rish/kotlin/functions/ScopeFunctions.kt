package com.rish.kotlin.functions

import com.rish.kotlin.collections.CourseCategory


fun main(){
    //exploreApply()
    //exploreLet()
    exploreWith()
}

fun exploreWith() {
    val numbers= mutableListOf(1,2,3,4,5)
    val result= with(numbers) {
        println("size is ${numbers.size}")
       val list= numbers.plus(19)
        list.sum()
    }
    println(result)
}


fun exploreLet() {

    val numbers=mutableListOf(1,3,4,5,6)

   val result= numbers.map { it*2 }.filter { it>6 }.let {
        println(it)
        it.sum()
    }
    println(result)
}

fun exploreApply() {

   val course= Course(id = 1, name = "design thinking in kotlin", author = "rishabh")
            .apply { courseCategory=CourseCategory.DESIGN }


    println(course)

}
