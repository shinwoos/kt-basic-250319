package exam6

fun main(args: Array<String>) {
    val names: MutableList<String> = ArrayList()
    names.add("Alice")
    names.add("Bob")
    names.add("Charlie")

    for (name in names) {
        println(name)
    }
}
