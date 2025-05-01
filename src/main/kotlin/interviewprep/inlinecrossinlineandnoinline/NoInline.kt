package interviewprep.inlinecrossinlineandnoinline

fun main() {
    goats("kukuriii",{},{})
}


inline fun goats(
    hen: String,
    crossinline binary: () -> Unit,
    catch: (Exception) -> Unit,
) {

    try {
        anothers() {
            binary()
        }
    } catch (e: Exception) {
        catch(e)
    }
}

fun anothers(
    nay: () -> Unit
) {

}