package interviewprep.scopeFunction


/*
fun main() {


var joker = "Rishi Srivastava"
joker = joker.let {
 "ice cream"
}
println(joker)
// your joker will now become ice cream

// but nothing happen in case of also

joker = joker.also {
 "ice cream"
}

// It;s value will remain Rishi Srivastava



}




Inside let block whatever you have written in the last line will become the new value for  the  variable
Whereas also will not modify anything it will just act or run as a side effect




 */

fun main() {

    var joker: String? = null
//    joker = "lioj"
//
//    joker = joker.let {
//        "ioooo"
//    }

    joker = joker?.let {
        println(it + "liom")
        "joker22"
    }


    joker = joker?.run {
        ""
    }

//    joker = joker.also {
//        "kpooooe"
//    }

    println(joker)
}
