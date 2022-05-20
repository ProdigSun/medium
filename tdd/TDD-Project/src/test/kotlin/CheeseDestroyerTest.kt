import org.junit.Assert
import org.junit.Test

class CheeseDestroyerTest {

    @Test
    fun `GIVEN an array without cheese, WHEN a rat tries to consume it THEN should return an empty array`() {
        val ratBehavior = RatBehavior()
        val eatenCheese = ratBehavior.eatCheese(arrayOf())
        Assert.assertTrue(eatenCheese.isNullOrEmpty())
    }

    @Test
    fun `GIVEN an array with 1 cheese, WHEN a rat tries to consume it THEN should return an empty array`() {
        val ratBehavior = RatBehavior()
        val eatenCheese = ratBehavior.eatCheese(arrayOf(
            Cheese("Tasty Cheese, HMM")
        ))
        Assert.assertTrue(eatenCheese.size == 1)
    }

    @Test
    fun `GIVEN an array with 2 cheeses, WHEN a rat tries to consume it THEN should return an empty array`() {
        val ratBehavior = RatBehavior()
        val eatenCheese = ratBehavior.eatCheese(arrayOf(
            Cheese("Tasty Cheese, HMM"),
            Cheese("kinda lame cheese")
        ))
        Assert.assertTrue(eatenCheese.size == 1)
    }
}