class Dollar(private var amount: Int) {

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        if (other is Dollar) {
            return amount == other.amount
        }
        return false
    }
}