//Calculate Sum of Positive Numbers Only

fun main(args:Array<String>){
    val nums = intArrayOf(10,-1,20,-4,-8,90,11);
    println("The Array used here is:")
    var sum:Int = 0;
    for(num in nums) {
        print("$num ");
        if (num <= 0) {
            continue
        }
        sum += num;
    }
    println("\nThe Sum of Positive numbers is $sum");

}
