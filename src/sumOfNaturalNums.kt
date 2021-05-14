//Program: Find sum of n natural numbers

fun main(args:Array<String>){
    println("Enter the value of n");
    val n:Int = readLine()!!.toInt()
    var sum = 0;
    for(i in 1..n){
        sum += i;
    }
    println("Sum of $n Natural numbers is $sum")

    // This could also be achieved using n*(n+1)/2 formula in constant time
}