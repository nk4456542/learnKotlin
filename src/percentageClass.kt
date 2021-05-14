fun addClassToResult(result:Double):String{
    val classBasedOnResult = when (result) {
        in 85.00..100.00 -> "Distinction Class"
        in 65.00..84.00 -> "First Class"
        in 35.00..64.00 -> "Second Class"
        else -> "Fail Class"
    }
    return classBasedOnResult;
}

fun main(args:Array<String>) {
    println("Enter your result in percentage:")
    val result:Double = readLine()!!.toDouble();
    val classBasedOnResult = addClassToResult(result);
    println("You belong to $classBasedOnResult based on your result: $result");
    println("Some sample results")
    val resultArray = doubleArrayOf(14.91,45.0,78.9,89.1,95.1);
    for(resultItem in resultArray) {
        val classResult = addClassToResult(resultItem)
        println("You belong to $classResult based on your result: $resultItem");
    }
}