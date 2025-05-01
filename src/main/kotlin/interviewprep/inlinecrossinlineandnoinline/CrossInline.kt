package interviewprep.inlinecrossinlineandnoinline

fun main() {

}

 inline fun goat(
    hen: String,
    crossinline binary: () -> Unit
){
    another(){
        binary()
    }
}

fun another(
    nay: () -> Unit
){

}