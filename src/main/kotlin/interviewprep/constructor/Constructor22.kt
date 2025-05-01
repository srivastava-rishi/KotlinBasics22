package interviewprep.constructor



fun main() {
   // Constructor22()
  //val boy = Boy("lioness",89)
}


// Constructor delegation
class Boy(
    private val name: String,
    private val pen: Int
) {

//    constructor() : this("Default Name",9) {
//       println(name)
//    }
    constructor() : this("testingName", 77) {
        println(name)
        println(pen)
    }
}


class Constructor22 (
   private val kite: String
) {
//    constructor() : this("lion") {
//        println("Hiii")
//    }
    init {
        println("lion")
    }
}