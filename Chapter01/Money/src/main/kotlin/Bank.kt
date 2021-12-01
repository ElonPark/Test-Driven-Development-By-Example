import java.util.Hashtable

class Bank {

    private val rates = Hashtable<Pair<String, String>, Int>()

    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }

    fun rate(from: String, to: String): Int {
        if (from == to) return 1
        // FIXME: - fix force unwrapping 2021-12-01 18:00:36
        return rates[Pair(from, to)]!!
    }

    fun reduce(source: Expression, to: String): Money = source.reduce(this, to)
}