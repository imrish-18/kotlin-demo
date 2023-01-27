package com.rish.kotlin.collections


fun main(){
    var courseList= courseList()
    exploreFilter(courseList)

}

fun exploreFilter(courseList: MutableList<Course>) {

    val developmentList=courseList.filter { it.category==CourseCategory.DEVELOPMENT }
            .forEach{println(it)}

}
