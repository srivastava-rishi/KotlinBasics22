package interviewprep.threads

fun main() {
    val a = CreateThreadUsingClass()
    a.start()
//    a.run()
//    a.interrupt()

    /*

     Difference between run and start function : -

     1. start(): When you call the start() method on a Thread object, it does the following:-
     #. It creates a new thread of execution.
     #. It calls the run() method of the Thread object on this new thread.

     2. run(): When you call the run() method directly on a Thread object, it behaves like a normal method call:-
      #. It does not create a new thread.
      #. The code inside the run() method will execute in the same thread that called it.

     3. interrupt(): It is a way to safely and cooperatively request the thread to stop.
     */
}

class CreateThreadUsingClass : Thread() {

    override fun start() {
        super.start()
        println("Thread onStart run")
    }

    override fun run() {
        /*
           we are commenting this because it does nothing :-
           # super.run()
         */
        println(currentThread().name)
        sleep(5000)
    }

    override fun interrupt() {
        super.interrupt()
        println("Thread interrupt")
    }
}