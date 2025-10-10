package interviewprep.generics

/*
#.Generic type with an upper bound
A generic with an upper bound restricts the type parameter
to be a subtype of a specific class or interface.
 */

fun main() {

}

class GenericWithUpperBound {

}

class OnBoardingViewMode : ViewModel() {

}

open class ViewModel {

    fun clear() {

    }
}


class ViewModelProvider private constructor() {

}

internal class ViewModelProviderImpl()

open class ViewModelStore {
    private val map = mutableMapOf<String, ViewModel>()
    fun put(key: String, viewModel: ViewModel) {
        val oldViewModel = map.put(key, viewModel)
        oldViewModel?.clear()
    }

    operator fun get(key: String): ViewModel? {
        return map[key]
    }

    fun keys(): Set<String> {
        return HashSet(map.keys)
    }

    fun clear() {
        for (vm in map.values) {
            vm.clear()
        }
        map.clear()
    }
}