package interviewprep.lazykeyword

import java.util.concurrent.ThreadPoolExecutor

fun main() {
   val session = LazyKeyword()
}

class LazyKeyword {
    /*

     Case1 :- val a = A()
      #. Here we are making an object of class A and that is triggering the secondary constructor to run
      #. But as we can see inside secondary constructor that it is doing some heavy operation

      Problem :- We are not even calling for a, but it's still doing its work

      #. So, we don't want this to happen till we are explicitly using it
      #. there comes lazy keyword to save us

     */
    val a by lazy {
        A()
    }
   //  val a = A()
}


class A {
    constructor() {
        /*
        Suppose here we are doing some really heavy operations
         */
        println("Yes, I am doing some heavy operations")
    }
}