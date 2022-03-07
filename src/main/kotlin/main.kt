val likesCount: Int = 1
val persons: String = if ((likesCount % 10) == 1 && (likesCount % 100) !== 11) "человеку" else "людям"

fun main() {
    println("Понравилось $likesCount $persons.")
}