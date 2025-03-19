package exam2

fun main() {
    var number = 15;

    val str = if (number % 2 == 0) "even" else "odd"

    if (number % 2 == 0) {
        print("2의 배수")
    } else if (number % 3 == 0) {
        print("3의 배수")
    } else if (number % 4 == 0) {
        print("4의 배수")
    }

    when {
        number % 2 == 0 -> print("2의배수")
        number % 3 == 0 -> print("3의배수")
        number % 4 == 0 -> print("4의배수")
    }


}