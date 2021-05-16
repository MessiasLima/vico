package pl.patrykgoworowski.liftchart_common.axis.model

import pl.patrykgoworowski.liftchart_common.entry.DataEntry


data class MutableAxisModel(
    override var minX: Float = 0f,
    override var maxX: Float = 0f,
    override var minY: Float = 0f,
    override var maxY: Float = 0f,
    override var step: Float = 1f,
    override var xSegmentWidth: Float = 1f,
    override var xSegmentSpacing: Float = 1f,
    override val entries: ArrayList<DataEntry> = ArrayList(),
) : AxisModel