package interviewprep.delegation

/**
  We can say delegation is an alternative to inheritance however they both provide similar behavior.
  Both of them allow us to reuse the code but slightly in a different way.In some cases, we need to
  use delegates instead of inheritance

  1. Where a class is not designed for inheritance — like when a class is final, private, etc.
  2. When we only need some functionality from the base class rather than all
 */

/*
-> Delegation means "asking someone else to do a task for you."
 */
fun main() {
    val a = HowDelegationWorks(BaseLevelEngine())
    val b = DelegationUsingBy(BaseLevelEngine())
   // a.startEngine()
    b.startEngine()
}


class HowDelegationWorks(
    private val engine: Engine
) : Engine {
    override fun startEngine() {
        /*
        Here we are not providing the implementation ourselves but delegating its responsibility
         We're just asking the engine (or engine object) to do it on our behalf — that's delegation.
         */
        engine.startEngine()
    }
}

// Explicit Delegation (Manually delegating tasks)
class BaseLevelEngine : Engine {
    override fun startEngine() {
        println("Hii Guyzzz some one is calling me using delegation")
    }
}

//  Delegation by *by* Keyword (The smart way!)

class DelegationUsingBy(
    private val engine: Engine
) : Engine by engine {

    // you can also add
}

interface Engine {
    fun startEngine()
}
