package exam5

class Person2(
    var name: String
) {

    fun greet() {
        println("Hello, my name is $name")
    }
}

fun main() {
    val person = Person2("Alice")
    person.greet()
}