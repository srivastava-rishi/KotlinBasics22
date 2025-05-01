package interviewprep.inlinecrossinlineandnoinline


fun main() {

    val a = Apple()
    a.naughty("Raja") {
        println("loooooooo")
    }

    a.revealSecret()

}

class Apple {

    private val secretKey = "67890-[rtyui"
    inline fun naughty(
        animalName: String,
        hen: () -> Unit
    ) {
//        println("name $animalName $secretKey") // Error: Cannot access 'secret': it is private in Apple
    }

    // to solve the above we need to do this

    @PublishedApi
    internal val anotherSecret = "Top Secret"

    inline fun revealSecret() {
        println(anotherSecret)
    }
}

// https://www.youtube.com/watch?v=T9sAlxqYFYc


// DisAdvantage of using a inline function

/*
1. A lambda parameter cannot be scoped from other context
*/

inline fun disAdvantage1(
    jokerName: String? = null,
    van: () -> Unit
) {
    Thread {
        // van() // Here, van() is nested inside another context.
    }.start()

    val kite: () -> Unit = {
        //van() // Here, van() is delayed execution.
    }

    hen {
        //van()// Here, van() is nested inside another lambda.
    }

    // there is a twist we can call these inside another inline function
    // one more thing all scope functions are inline function
    run {
        van()
    }.also {
        van()
    }.let {
        van()
    }
}


fun hen(
    hen: () -> Unit
) {

}
