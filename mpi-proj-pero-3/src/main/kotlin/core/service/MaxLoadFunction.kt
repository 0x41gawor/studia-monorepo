package core.service

import core.model.FlowMatrix
import core.model.Graph

class MaxLoadFunction {
    fun run(e: Graph, x: FlowMatrix): Int {
        val y = LinkOverloadCalculator()
        return y.run(e, x).maxOrNull() ?: Int.MAX_VALUE
    }
}