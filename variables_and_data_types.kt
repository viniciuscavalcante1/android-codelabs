fun main() {
    /*
    The following lines are commented because Kotlin has type inference! But if we don't specify any value before,
     we still have to insert the type.
    val count: Int = 2
    val word: String = "strawberry"
    val pi: Double = 3.1415
    val floatUpper: Float = 2.0F
    val floatLower: Float = 2.0f
    val isDone: Boolean = false
    */
    val count = 2
    val word = "strawberry"
    val pi = 3.1415
    val floatUpper = 2.0F
    val floatLower = 2.0f
    val isDone = false
    println("You have $count unread messages.")
    println("$word's available: $count")
    println("The magic number is $pi")
    println("Another magic number is $floatUpper")
    println("Wow, we have a lot of magic numbers! Updating... The new magic number is $floatLower")
    println("Is Java dead? Well, verifying... The answer is: $isDone")
}