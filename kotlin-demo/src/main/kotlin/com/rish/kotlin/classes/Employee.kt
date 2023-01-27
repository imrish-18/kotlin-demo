package com.rish.kotlin.classes

 data class Employee(val id:Int,
        val name:String) {
}


fun main(){
    val employee=Employee(1,"rishabh")
    println(employee)
    val employee1=Employee(1,"rishabh")
    println(employee==employee1)

    val employee2=employee.copy(id = 2, name = "sharma")
    println(employee2)

}