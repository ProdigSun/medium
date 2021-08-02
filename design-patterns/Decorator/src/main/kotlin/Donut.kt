interface Donut {
    fun getPrice(): Double
}

class BaseDonut : Donut {
    override fun getPrice(): Double {
        return 0.1
    }
}

class ChocolateDonut constructor(private val donut: Donut) : Donut {
    private val cost = 0.5
    override fun getPrice(): Double {
        return donut.getPrice() + cost
    }
}

class MarshmallowDonut constructor(private val donut: Donut) : Donut {
    private val cost = 0.5
    override fun getPrice(): Double {
        return donut.getPrice() + cost
    }
}

fun main() {
    val chocolateDonut = ChocolateDonut(
        MarshmallowDonut(
            BaseDonut()
        )
    )
}