import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MoneyTests {

    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        var product: Dollar = five.times(2)
        assertEquals(10, product.amount)
        product = five.times(3)
        assertEquals(15, product.amount)
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }
}