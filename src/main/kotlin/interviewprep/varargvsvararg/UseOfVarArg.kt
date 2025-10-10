package interviewprep.varargvsvararg

fun main() {
    val cat = UseOfVarArg()
    cat.usingArray(arrayOf("yooo")) // No need to create an array explicitly
    cat.usingVararg("lion","kite") // Must create array explicitly
}

class UseOfVarArg {

    fun usingVararg(vararg items: String) {
        println("Vararg received: ${items.joinToString()}")
    }

    fun usingArray(items: Array<String>) {
        println("Array received: ${items.joinToString()}")
    }
}