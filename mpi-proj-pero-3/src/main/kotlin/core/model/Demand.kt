package core.model

data class Demand(
    val id: Int,
    val srcNode: Int,
    val dstNode: Int,
    val volume: Int,
    val paths: List<Path>
) {
}

