package core.service

import core.model.FlowMatrix
import core.model.Graph

class LinkLoadCalculator {
    fun run(e: Graph, x: FlowMatrix): IntArray {

        val linkLoads = IntArray(e.links.count) { 0 }
        for (demand in e.demands.body) {
            for (path in demand.paths) {
                for (link in e.links.body) {
                    if (path.contain(link.id)) {
                        linkLoads[link.id-1] += x.body[demand.id-1][path.id-1]
                    }
                }
            }
        }
        return linkLoads
    }
}