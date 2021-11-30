open class Money(protected var amount: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Money) {
            val isSameClass = javaClass.kotlin.equals(other.javaClass.kotlin)
            return amount == other.amount && isSameClass
        }
        return false
    }
}