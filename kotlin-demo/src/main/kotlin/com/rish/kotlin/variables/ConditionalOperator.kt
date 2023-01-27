package com.rish.kotlin.variables

class ConditionalOperator {
}
fun main() {
    val name = "alex halex"
    var result = if (name.length == 5)
        println("name is $name")
    else
        println("hello this is  name with length ${name.length}")
    println(result)
    var index = 7;
    while (name.length > index) {
        println(index)
        index++;
    }

}