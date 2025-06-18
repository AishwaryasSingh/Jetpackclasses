package Assignment2

fun main(){
    println(Customer("Aishwarya"))
    println(Customer(null))
}
fun Customer(name:String?):String{
    val guestName=name?:"Guest"
    return "Good Morning dear $guestName"
}