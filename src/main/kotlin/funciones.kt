fun main(){
    println("Hello")
    sayHello()
    sayHelloTo(name= "Peter")
    sayHelloToFrom(name= "Bruce Wayne", city= "Gotham city")
    println("El doble de 25 es ${ duplicate(num = 25) }")
    val result=divide(num1 = 99, num2 = 15.0)
    println("El resultado de 99/15 es $result ")
    println(fullName("John", "Snow"))

    welcomeToMexico()
    welcomeToMexico(name = "Superman")

    //Params with name
    sayHelloToFrom(name = "Superman", city = "Metropolis")
    sayHelloToFrom(city = "Namekusei", name = "Piccolo")
}

// functions without param and without return
fun sayHello(){
    println("Hello")
}

// Functions with params and without return
fun sayHelloTo(name: String){
    println("Hello $name")
    println("Welcome")
}

fun sayHelloToFrom(name: String, city: String){
    println("Hello $name from $city")
}

// Functions with return
// We must specify the datatype
fun duplicate(num: Int): Int {
    return num * 2
}

fun divide(num1: Int, num2: Double): Double{
    return  num1/num2
}

fun fullName(firstName: String, lastName: String): String{
    return  "$firstName $lastName"
}

//Functions with optional Params
fun welcomeToMexico(name: String="Invitado"){
    println("Welcome to Mexico $name")
}