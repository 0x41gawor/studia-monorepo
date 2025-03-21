package core.model

class FlowMatrix(demands: Demands) {
    var body: Array<IntArray> = arrayOf()
    var demandsCount = 0
    var demands: Demands
    private val volumes: ArrayList<Int> = arrayListOf()
    private var pathsCount = 0

    init {
        this.demands = demands
        demandsCount = demands.count()
        pathsCount = demands.getMaxPathsCount()
        body = Array(demandsCount) { IntArray(pathsCount) { Int.MAX_VALUE } }
        for (i in 0 until demandsCount) {
            volumes.add(demands.body[i].volume)
        }
    }

    fun init() {
        for (d in 0 until demandsCount) {
            var hd = volumes[d] // mamy do rozdania hd
            for (p in 0 until demands.body[d].paths.size-1) { //petla idzie od pierwszej do przedostatniej sciezki
                if(hd>0) { // jesli zostalo jeszcze cos tego hd to dajemy kawaleczek
                    val x = (0..hd).random()
                    body[d][p] = x
                    hd-=x
                } else { //jak hd juz sie skonczylo to dajemy 0
                    body[d][p] = 0
                }
            }
            body[d][demands.body[d].paths.size-1] = hd //ostatniej sciezke dajemy to co zostalo z hd
        }
    }

    override fun toString(): String {

        print("    ")
        for (p in 0 until pathsCount) {
            print("p$p ")
        }
        println(" hd")
        for (d in 0 until demandsCount) {
            print("d$d: ")
            for (p in 0 until pathsCount) {
                val item = body[d][p]
                if (item == Int.MAX_VALUE) {
                    print(" - ")
                } else {
                    if (item < 10) {
                        print(" $item ")
                    } else {
                        print("$item ")
                    }
                }
            }
            if (volumes[d] < 10) {
                println("  ${volumes[d]}")
            } else {
                println(" ${volumes[d]}")
            }
        }
        return ""

//        return ""
    }
}