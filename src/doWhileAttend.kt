//Program: Print “I will attend online class” until you attend

fun main(args:Array<String>){
    val stringToPrint = "I will attend online class"
    do {
        println("$stringToPrint")
        println("Enter you Attendance: A/P")
        var absent = readLine();
        if(absent == "P")
            break;
    }while(true)
}