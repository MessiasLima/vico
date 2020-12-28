package pl.patrykgoworowski.liftchart_core.data_set

interface EntryManager<T: AnyEntry> {

    val entries: Collection<AnyEntry>

    val minX: Float
    val maxX: Float

    val minY: Float
    val maxY: Float

    val size: Int
        get() = entries.size

    fun setEntries(entries: Collection<T>)
    fun setEntries(vararg entries: T)

    operator fun plusAssign(entry: AnyEntry)
    operator fun plusAssign(entries: Collection<AnyEntry>)

    operator fun minusAssign(entry: AnyEntry)
    operator fun minusAssign(entries: Collection<AnyEntry>)

    companion object {
        const val NO_VALUE = -1f
    }

}