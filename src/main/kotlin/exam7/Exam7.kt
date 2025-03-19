package exam7

fun main(args: Array<String>) {
    val ages: MutableMap<String, Int> = HashMap()
    ages["Alice"] = 25
    ages["Bob"] = 30
    ages["Charlie"] = 35

    for ((key, value) in ages) {
        println("$key is $value years old.")
    }
}
