fun addOne(number: Int): Int {
    return number + 1
}

fun printFullName(firstName: String, secondName: String) {
    println("$firstName $secondName")
}

fun displayHello() {
    println("Hello, world!")
}

fun displayHelloAndroidTwice() {
    println("Hello, Android!")
    println("Hello, Android!")
}

fun displayGreetings(name: String) {
    println("Hello, $name!")
}

fun displayOneToThree() {
    println("1")
    println("2")
    println("3")
}

fun displayLearning() {
    println("I'm")
    println("Learning")
    println("Kotlin!")
}

fun displayWeekdays() {
    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday")
}

fun main() {
    println(addOne(1))
    printFullName("Vinícius", "Cavalcante")
    displayHello()
    displayHelloAndroidTwice()
    displayGreetings("Vinícius")
    displayOneToThree()
    displayLearning()
    displayWeekdays()
}