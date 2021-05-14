//Program: Read 3 numbers from Keyboard and find the sum

fun main(args:Array<String>){
    val num1 = readLine()!!.toInt();
    val num2 = readLine()!!.toInt();
    val num3 = readLine()!!.toInt();

    val sum = num1 +  num2 + num3;

    println("$num1 + $num2 + $num3 = $sum");

}