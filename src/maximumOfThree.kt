//Program: Find maximum of 3 numbers

fun main(args:Array<String>){
    println("Enter three numbers:");
    val num1:Int = readLine()!!.toInt();
    val num2:Int = readLine()!!.toInt();
    val num3:Int = readLine()!!.toInt();

    val max = if(num1 > num2 && num1 > num3){
        num1;
    } else if(num2 > num1 && num2 > num3){
        num2;
    } else {
        num3;
    }

    println("Max($num1, $num2, $num3) is $max");

}