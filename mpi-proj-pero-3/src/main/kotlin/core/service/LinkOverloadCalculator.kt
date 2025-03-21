package core.service

import core.model.FlowMatrix
import core.model.Graph

class LinkOverloadCalculator {
    fun run(e: Graph, x: FlowMatrix): IntArray {
        val l = LinkLoadCalculator()
        val linkLoads = l.run(e,x)
        val linkOverloads = IntArray(e.links.count) { 0 }
        for (i in 0 until e.links.count) {
            linkOverloads[i] = linkLoads[i] - e.links.body[i].capacity
        }

        return linkOverloads
    }
}