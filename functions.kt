fun addOne(number: Int): Int {
    return number + 1
}

fun printFullName(firstName: String, secondName: String) {
    println("$firstName $secondName")
}

fun displayHello() {
    println("Hello, world!")
}

fun main() {
    println(addOne(1))
    printFullName("Vinícius", "Cavalcante")
    displayHello()
}