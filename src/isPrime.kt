//Program: Function to check number is prime and return true or false

fun isPrime(num:Int):Boolean{
    for(i in 2..num/2){
        if(num%i == 0){
            return false;
        }
    }
    return true;
}

fun main(args:Array<String>){
    println("Enter the number")
    val num:Int = readLine()!!.toInt();
    var result:Boolean = isPrime(num);
    if(result) {
        println("$num is prime")
    }else {
        println("$num is not prime")
    }
}
