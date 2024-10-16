package interviewprep.constructor


fun main() {
    val test = Test()
}
class Test(
    private val name: String,
    private val table: Table
){
    // Constructor delegation
    constructor() : this("tttt", Table()) {
       println(name)
       println(table.doSomething())
    }

    init {
        println("yoo")
    }
}


class Table {
    fun doSomething() {
        println("I am doSomething function")
    }
}