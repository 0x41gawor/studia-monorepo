package core.model

data class Link(
    val id: Int,
    val srcNode: Int,
    val dstNode: Int,
    val capacity: Int
) {
}

