package com.rish.kotlin.functions

import com.rish.kotlin.collections.CourseCategory

data class Course(val id:Int,
        val name:String,
        val author:String,
        var courseCategory:CourseCategory=CourseCategory.DEVELOPMENT) {
}