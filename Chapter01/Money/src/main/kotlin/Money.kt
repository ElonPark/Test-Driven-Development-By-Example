abstract class Money(protected var amount: Int, protected val currency: String) {

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")
        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }

    fun currency(): String = currency

    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        if (other is Money) {
            val isSameClass = javaClass.kotlin.equals(other.javaClass.kotlin)
            return amount == other.amount && isSameClass
        }
        return false
    }
}