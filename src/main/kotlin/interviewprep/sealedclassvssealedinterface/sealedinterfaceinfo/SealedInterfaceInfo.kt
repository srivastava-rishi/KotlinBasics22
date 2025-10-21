package interviewprep.sealedclassvssealedinterface.sealedinterfaceinfo

import java.net.BindException

/*
Definition -
- A sealed interface is similar to a sealed class, but it is used to represent a restricted set of interfaces rather than classes

- Info -
    1. Sealed interfaces cannot have constructors with parameters, but they can have properties.
    2. Sealed interfaces can only have abstract methods, abstract properties , data class's , normal class as well as object
    3. Sealed interfaces can  be implemented by classes , objects , normal interfaces and sealed interfaces.
 */

fun main() {

}

// 1.

//sealed interface Http(errorCode: Int) {
//    object TimeoutError : Http(302)
//    object NotRespondingError : Http(404)
//    object BadRequestError : Http(206)
//}

// 2.

sealed interface Bird {
    val legs: Int
    fun sound(): String = "lion" // // these are default implementations

   //  var hi = "jjj" // Property initializers are not allowed in interfaces
   //  val age = 1       // Property initializers are not allowed in interfaces
    fun info() { // these are default implementations
        println("joker")
    }
}

sealed interface Na : Bird {
    override fun sound(): String {
        return "ioaccd"
    }
}

interface Pot : Bird {
    var fan: String
    fun nooo() {
        println("lion")
    }
}

class Kitty8(override var fan: String, override val legs: Int) : Pot {
    override fun nooo() {
        //  super.nooo()
        println(" I have overwriutten ir")
    }
}

// 3.

sealed interface Raju {
    object Hen : Raju
}

class Kitty : Raju {

}

object Bat : Raju

interface A
interface B : A
