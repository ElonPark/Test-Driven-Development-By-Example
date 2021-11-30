class Money(internal val amount: Int, val currency: String): Expression {

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Money) return false
        return amount == other.amount && currency.equals(other.currency)
    }

    override fun toString(): String = "$amount $currency"

    override fun reduce(to: String): Money = this

    fun times(multiplier: Int): Money? = Money(amount * multiplier, currency)

    fun plus(addend: Money): Expression {
        return Sum(this, addend)
    }
}