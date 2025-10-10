package interviewprep.continuationPassingStyle


fun main() {
    val cps = CPS()
    println(cps.fetchData())
}

class CPS {

    /*
       Internally it’s like:- Caller --calls--> fetchData() --immediate return--> Result
     */
    fun fetchData(): String {
        return "Data from server"
    }
}