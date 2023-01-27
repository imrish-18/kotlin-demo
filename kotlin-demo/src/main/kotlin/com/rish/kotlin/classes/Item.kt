package com.rish.kotlin.classes

class Item() {
    var name:String=" "
            var price:Double=0.0
                get(){
                    println("inside getter...")
                     return field
                     }
                set(value) {field=value}
    constructor(_name:String):this(){
        name=_name
    }
}
fun main(){
    val item=Item("roy")
    println(item.name)
    item.price=10.0
    println(item.price)
    println(display())
    val days:Days=Days.Monday
    println(days)
}
fun display()=  "rishabh sharma is "
 enum class Days{
     Monday,Tuesday
 }
sealed class Data{

}