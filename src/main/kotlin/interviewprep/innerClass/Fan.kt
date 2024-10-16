package interviewprep.innerClass


fun main() {

}


class Fan {
    val kite: Int = 7

    fun goat(): Int {
        return 8
    }

    inner class Joker {
        val ben: Int = kite
        val n = goat()
    }
}