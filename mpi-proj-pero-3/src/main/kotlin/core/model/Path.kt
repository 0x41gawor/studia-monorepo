package core.model

data class Path(
    val id: Int,
    val linkIdList: List<Int>
) {

    constructor(data: Path) : this(
        data.id,
        data.linkIdList
    )

    fun contain(linkId: Int): Boolean {
        return linkIdList.contains(linkId)
    }
}
