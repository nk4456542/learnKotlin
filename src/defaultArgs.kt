//Program to demonstrate default values and named arguments in constructors

fun main(args:Array<String>){
    var log = Log(numberOfLines = 1)
    println("${log.currentData}, ${log.finalLineValue}")
}

class Log(data:String="Empty",numberOfLines:Int=0){
    var currentData:String
    var finalLineValue:Int
    init {
        currentData = data
        finalLineValue = numberOfLines
    }
}