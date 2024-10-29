package interviewprep.threads


fun main() {
    /*
      val runnable = CreateThreadUsingInterface()
      runnable.run()  // Again if we call it like this it will run on the same thread from which I am calling it
     */
    val runnable = Thread(CreateThreadUsingInterface())
    runnable.start() // ideal way
}


class CreateThreadUsingInterface: Runnable {
    override fun run() {
        println(Thread.currentThread().name)
        Thread.sleep(4000)
    }
}