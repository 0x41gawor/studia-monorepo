package ea

import core.model.FlowMatrix

class Chromo(
    private val wrapee: FlowMatrix,
    var fitnessValue: Int = Int.MAX_VALUE
    ) {

    fun getFlowMatrix(): FlowMatrix {
        return wrapee
    }

    fun insertGene(d: Int, gene: IntArray) {
        wrapee.body[d] = gene
    }

    fun getGene(d: Int): IntArray {
        val size = wrapee.body[d].size
        val copyOfGene =  IntArray(size)
        for (i in 0 until size) {
            copyOfGene[i] = wrapee.body[d][i]
        }
        return copyOfGene
    }

    fun mutate() {
        for (d in 0 until wrapee.demandsCount) {
            val x = (0..99).random()
            if (x < PROBABILITY_OF_GENE_MUTATION) {
                val numberOfPaths = wrapee.demands.body[d].paths.size
                var idOfRobbedPath: Int
                do {
                    idOfRobbedPath = (0 until numberOfPaths).random()
                } while (wrapee.body[d][idOfRobbedPath] == 0)

                var idOfAwardedPath:Int

                do{
                    idOfAwardedPath = (0 until numberOfPaths).random()
                } while(idOfAwardedPath == idOfRobbedPath)

                wrapee.body[d][idOfRobbedPath] -= 1
                wrapee.body[d][idOfAwardedPath] += 1
            }
        }
    }

    override fun toString(): String {
        return "$wrapee" + "Fitness Value: $fitnessValue\n"
    }

    companion object {
        private const val PROBABILITY_OF_GENE_MUTATION = 30
    }
}