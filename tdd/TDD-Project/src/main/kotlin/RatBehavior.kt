class RatBehavior {
    fun eatCheese(cheesePieces: Array<Cheese>): Array<Cheese> {
        return if (cheesePieces.size > 1) {
            cheesePieces.sliceArray(0 .. cheesePieces.size - 2)
        } else {
            cheesePieces
        }
    }
}

data class Cheese(
    val type: String
)