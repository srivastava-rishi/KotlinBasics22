package interviewprep.sealedclassvssealedinterface.sealedclassinfo

/*
Definition -
- A sealed class is a class that can be subclassed, but only inside the same file where it is declared
  or
-  A sealed class is a class that restricts which other classes can inherit from it, All subclasses must be
 declared within the same file as the sealed class itself.

- Info -
    1. Sealed classes can have constructors with parameters.
    2. Sealed classes can have abstract methods, concrete methods normal properties as well as abstract properties.
    3. Sealed classes can be extended by classes, objects, and other sealed classes.
 */

fun main() {
    //Ram().why()
    Table.why()
}

// 1 ->
sealed class HttpError(val errorCode: Int) {
    object TimeoutError : HttpError(302)
    object NotRespondingError : HttpError(404)
    object BadRequestError : HttpError(206)
}

// 2 ->
sealed class Animal {
    abstract val legs: Int
    abstract fun sound(): String

    var hi = "jjj"
    val age = 1
    fun info() {
        println("joker")
    }
}

sealed class Dog : Animal() {
    override fun sound() = "Woof"

    /*
    Remember this :-
    object Hi: Dog() {
        override val legs: Int
            get() = TODO("Not yet implemented")
    }

    1.  data class Hii(val hlp: Int) : Dog() {
        override val legs: Int
            get() = TODO("Not yet implemented")
    }

     2.  data class Hii(val hlp: Int, override val legs: Int) : Dog()
     */
    data class Hii(val hlp: Int, override val legs: Int) : Dog()
}

// 3 ->

sealed class Joker {
    object Hi : Joker()

    fun why() {
        println("lion")
    }
}

// Gave warning - 'sealed' subclass has no state and no overridden 'equals()'
class Ram : Joker() {
    fun doD() {
        why()
    }
}

object Table : Joker() {

}


