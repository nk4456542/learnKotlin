//Program: Read temperature in Celsius and convert to Fahrenheit
fun main(args:Array<String>)
{
    println("Enter the temperature in Celsius")
    var celsius = readLine()!!.toFloat()
    var farenheit = (celsius * 9/5) + 32
    println("$celsius in Fahrenheit is $farenheit")
}