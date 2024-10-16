package interviewprep.higherorderfunction

import kotlin.concurrent.thread


/*
Q.HigherOrderFunction :-
Answer => A higher-order function is a function

    1. that takes functions as parameters, or returns a function.

     fun example1(
        name: String,
        age: Int,
        eligibleToVote: (String) -> Unit
    ) {
     //
    }

    2. Returns a function as its result.

   fun createGreeting(): (String) -> String {
    return { name: String -> "Hello, $name" }
   }

 */

fun main() {
    val higherOrderFunction = HigherOrderFunction()
    higherOrderFunction.example1("Rishi", 22) {
        println(it)
    }
    // we need to store example2() inside a function as example2() is returning a function
    // and that function takes a parameter of string
    val goat = higherOrderFunction.example2()
    println(goat("Rishi"))
}

class HigherOrderFunction {

    // 1.
    fun example1(
        name: String,
        age: Int,
        eligibleToVote: (String) -> Unit
    ) {
        println("checking your eligibilty....")
        thread {
            Thread.sleep(2000)
            if (age < 18) {
                eligibleToVote("sorry $name but not eligible yet")
            } else {
                eligibleToVote("congrats $name  you are eligible")
            }
        }
    }

   // 2.
    fun example2(): (String) -> String {
        return {
            "Hii $it"
        }
    }
}