open class Money(protected var amount: Int, val currency: String) {

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }

    fun times(multiplier: Int): Money? = Money(amount * multiplier, currency)

    override fun equals(other: Any?): Boolean {
        val money = other as Money
        return amount == money.amount && currency.equals(money.currency)
    }

    override fun toString(): String = "$amount $currency"
}