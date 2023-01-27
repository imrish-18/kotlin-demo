package com.rish.kotlin.collections

class KotlinList {

    fun iterateCollection() {
        // mutable collections
        // list
        val mutableList= mutableListOf("rishabh","sharma")
        mutableList.add("sachin")
        println("mutable list is .. $mutableList")
       // set

        val mutableSet= mutableSetOf("java","java","kotlin")
        mutableList.add("spring")
        println("mutable set is .. $mutableSet")

        // map
        val mutableMap= mutableMapOf(1 to "java",2 to "java" )
        println("mutable map is... $mutableMap")

        //immutable collections
        val immutableList= listOf("java","kotlin")
        println("immutable list is..  $immutableList")

        // set

        val immutableSet= setOf("kotlin","spring","spring")
        println("immutable set is.. $immutableSet")

        // map
        val immutableMap= mapOf(1 to "java",2 to "kotlin",2 to "spring")
        println("immutable map is .. $immutableMap")
    }

}
fun main(){
    val list=KotlinList()
    list.iterateCollection()
}