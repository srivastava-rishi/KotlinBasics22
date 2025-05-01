package interviewprep.lateinit


fun main() {
    val a = Joker.getInstance()
    a.mockData()
    val b = Joker.getInstance()
    val c = Joker.getInstance()
    val d = Joker.getInstance()

    //
    println("a - ${a.list}")
    println("b - $b")
    println("c - $c")
    println("d - ${d.list}")
}

class Joker {

    val list = mutableListOf<String>()

    fun mockData() {
        list.add("lion")
    }

    companion object {
        private var INSTANCE: Joker? = null

        //  private lateinit var INSTANCE2: Joker
        fun getInstance(): Joker {
            //  if (!::INSTANCE2.isInitialized) INSTANCE = Joker()
//            if (INSTANCE == null) INSTANCE =
            return Joker()
        }
    }

}