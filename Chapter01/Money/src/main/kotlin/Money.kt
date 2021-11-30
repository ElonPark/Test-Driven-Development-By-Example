open class Money(protected var amount: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Money) return amount == other.amount
        return false
    }
}