fun main(args: Array<String>) {
    val n = -1
    val a = 100
    when (a) {
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }
    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than -3.")
    }
    val a = 11
    val n = "11"
    when (n) {
        "cat" -> println("Cat? Really?")
        12.toString() -> println("Close but not close enough.")
        a.toString() -> println("Bingo! It's eleven.")
    }
}