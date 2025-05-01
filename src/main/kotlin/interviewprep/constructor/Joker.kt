package interviewprep.constructor


fun main() {
    Hen()
}

class Hen(
    private val hi: String
) {

    constructor(): this("lion") {
        println(hi)
    }

    init {
        println("tiger")
    }

}