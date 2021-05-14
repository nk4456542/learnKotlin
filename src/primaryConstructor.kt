//Program to demonstrate primary constructors

fun main(args:Array<String>){
    val person1 = Person("Serkhan", 25)
    println("From the main function")
    println("${person1.firstName} is of age ${person1.age}")
}

class Person(val fname:String, var personAge:Int){
    val firstName:String
    val age:Int

    init {
        firstName = fname.uppercase();
        age = personAge;
        println("From the `init` Constructor")
        println("$firstName is $age years old")
    }
}