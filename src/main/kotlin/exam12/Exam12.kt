package exam12


@JvmOverloads
fun sayHello(name: String = "Guest") {
    println("Hello, $name")
}

fun main(args: Array<String>) {
    sayHello()
    sayHello("Alice")
}
