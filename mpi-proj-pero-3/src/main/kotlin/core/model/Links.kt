package core.model

class Links {
    val body: ArrayList<Link> = arrayListOf()
    var count = 0

    fun add(link: Link){
        body.add(link)
        count++
    }

    override fun toString(): String {
        return body.toString()
    }
}