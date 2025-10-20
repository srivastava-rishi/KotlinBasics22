package interviewprep.sealedclassvssealedinterface.sealedinterfaceinfo

import interviewprep.sealedclassvssealedinterface.sealedclassinfo.HttpError
import interviewprep.sealedclassvssealedinterface.sealedclassinfo.Ram

/*
Definition -
- A sealed interface is similar to a sealed class, but it is used to represent a restricted set of interfaces rather than classes
  or
-  A sealed class is a class that restricts which other classes can inherit from it, All subclasses must be
 declared within the same file as the sealed class itself.

- Info -
    1. Sealed interfaces cannot have constructors with parameters, but they can have properties.
    2. Sealed interfaces can only have abstract methods, but they can also have default implementations for those methods. as well as
    Property initializers are not allowed in interfaces - val age = 1 (you can't do this)
    example -
    3. Sealed interfaces can only be implemented by classes and objects but not extended by other interfaces or sealed interfaces.
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

// 3.

sealed interface Raju {
    object Hen : Raju
}

class Kitty: Raju {

}

object Bat: Raju {

}
