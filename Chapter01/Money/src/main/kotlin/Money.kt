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

    override fun reduce(bank: Bank, to: String): Money {
        val rate = bank.rate(currency, to)
        return Money(amount / rate, to)
    }

    override fun plus(addend: Expression): Expression {
        return Sum(this, addend)
    }

    fun times(multiplier: Int): Expression = Money(amount * multiplier, currency)
}