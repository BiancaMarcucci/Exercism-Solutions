object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        return source.filterNotNull().flatMap {
            when (it) {
                is List<*> -> flatten(it)
                is Array<*> -> it.filterNotNull().toList()
                else -> listOf(it)
            }
        }

    }
}