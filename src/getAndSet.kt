//Program to demonstrate the use of getters and setters

fun main(args: Array<String>) {
    val maria = Girl()
    maria.actualAge = 15
    maria.age = 15
    println("Maria: actual age = ${maria.actualAge}")
    println("Maria: pretended age = ${maria.age}")
    val angela = Girl()
    angela.actualAge = 35
    angela.age = 35
    println("Angela: actual age = ${angela.actualAge}")
    println("Angela: pretended age = ${angela.age}")
    val Eda = Girl()
    Eda.actualAge = 27
    Eda.age = 27
    println("Eda: Actual age = ${Eda.actualAge}")
    println("Eda: Pretended age = ${Eda.age}")
}

class Girl {
    var age: Int = 0
        get() = field
        set(value) {
            field = if (value < 18)
                18
            else if (value >= 18 && value <= 30)
                value
            else
                value - 3
        }
    var actualAge: Int = 0
}