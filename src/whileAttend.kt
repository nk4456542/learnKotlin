//Program: Print “I will attend online class” 100 times

fun main(args:Array<String>){
    val stringToPrint = "I will attend online class"
    println("Printing $stringToPrint 100 times")

    var i = 1;
    while(i<=100){
        println("$i) $stringToPrint")
        i++;
    }
}