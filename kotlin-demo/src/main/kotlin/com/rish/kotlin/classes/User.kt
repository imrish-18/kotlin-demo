open class User(val  id:Int,val name:String){
 open fun login(){
     println("inside user class...")
 }
}

class Student(id:Int,name:String):User(id ,name)
{
    override fun login(){
        println("inside Student class...")
    }
}

class Instructor (id:Int,name: String):User(id,name)
{
    override fun login(){
        println("inside Instructor class...")
        super.login()
    }
}
object  Authenticate{
    fun authenticate(userName:String,password:String){
        println("user and password... $userName")
    }
}
fun main(){
    val student=Student(1,"rishabh")
    val instructor=Instructor(2,"sharma")
     Authenticate.authenticate("rishabh","")
    println("name and id from student class... ${student.name}")
    println("name and id from student class... ${instructor.name}")
    student.login()
    instructor.login()
}