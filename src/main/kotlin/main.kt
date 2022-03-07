fun main() {
    val likesCount: Int = 111
    val persons: String = if ((likesCount % 10) == 1 && (likesCount % 100) !== 11) "человеку" else "людям"
    println("Понравилось $likesCount $persons.")
}