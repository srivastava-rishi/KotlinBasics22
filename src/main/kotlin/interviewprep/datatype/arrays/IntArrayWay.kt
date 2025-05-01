package interviewprep.datatype.arrays;


fun main() {
   val naughty = IntArrayWay()
    naughty.goat(intArrayOf(6,7,8))
    var hen = intArrayOf(6,7,8)
    for (i in 0.. hen.size){
        println(i)
    }
}


class IntArrayWay {
    fun goat(joker: IntArray) {
        println(joker.size)
    }
}
