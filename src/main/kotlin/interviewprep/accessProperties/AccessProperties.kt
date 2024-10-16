package interviewprep.accessProperties

fun main() {
    val hi = AccessProperties()
    hi.hen = 677
    println(hi.hen)
    println(hi.lion)
}

class AccessProperties {
    var hen = 89
    val murgi: String get() = "999"
    val lion: String get() {
        return "j $hen"
    }
}