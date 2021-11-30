abstract class Money(protected var amount: Int) {

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount)
        fun franc(amount: Int): Money = Franc(amount)
    }

    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        if (other is Money) {
            val isSameClass = javaClass.kotlin.equals(other.javaClass.kotlin)
            return amount == other.amount && isSameClass
        }
        return false
    }
}