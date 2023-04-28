fun main() {
    val likes = 1

    if (likes == 1) {
        println("Понравилось $likes человеку")
    } else if (likes > 1 || likes < 5) {
        println("Понравилось $likes человекам")
    } else if (likes > 5 || likes < 21) {
        println("Понравилось $likes людям")
    } else if (likes == 21 || likes == 31 || likes == 41 || likes == 51 || likes == 61) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}