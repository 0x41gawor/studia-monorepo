package core.service

import core.model.Path
import core.model.Demand
import core.model.Demands
import core.model.Link
import core.model.Links
import java.io.BufferedReader
import java.io.File
import java.io.InputStream

class Parser {
    val links: Links = Links()
    val demands: Demands = Demands()
    var currentLine: Int = 1


    fun init(fileName: String) {
        //readFile(fileName)
        println("Parsing file in progress...")
        readFile2(fileName)
    }

    private fun readFile(fileName: String) {
        val bufferedReader: BufferedReader = File(fileName).bufferedReader()
        val inputString = bufferedReader.use { it.readText() }
        println(inputString)
    }

    private fun readFile2(fileName: String) {
        val inputStream: InputStream = File(fileName).inputStream()
        val lineList = mutableListOf<String>()


        inputStream.bufferedReader().forEachLine { lineList.add(it) }

        val numberOfLinks = Integer.parseInt(lineList.elementAt(0));

        for (i in 0 until numberOfLinks) {
            val line = lineList.elementAt(i + 1)
            val list = line.split(" ", "    ")
            val id = Integer.parseInt(list[0])
            val srcNode = Integer.parseInt(list[1])
            val dstNode = Integer.parseInt(list[2])
            val capacity = Integer.parseInt(list[3])
            val link = Link(id, srcNode, dstNode, capacity)
            links.add(link)

        }
        currentLine = numberOfLinks + 3
        val numberOfDemand = Integer.parseInt(lineList.elementAt(currentLine-1))

        currentLine++
        for(i in 0..numberOfDemand){
            if(currentLine<=lineList.size) {
                val readDemand = readDemand(lineList, currentLine)
                demands.add(readDemand)
            }
        }
//        println("--------UTWORZONE LINKI--------")
//        println(links)
//        println("--------UTWORZONE DEMANDY--------")
//        println(demands)
    }

    private fun readDemand(lineList: MutableList<String>, start: Int): Demand {
        var line = lineList.elementAt(start-1)
        val list = line.split(" ", "    ")
        val id = Integer.parseInt(list[0])
        val srcNode = Integer.parseInt(list[1])
        val dstNode = Integer.parseInt(list[2])
        val volume = Integer.parseInt(list[3])
        val listOfPaths = ArrayList<Path>()
        currentLine++
        val numberOfPaths = Integer.parseInt(lineList.elementAt(currentLine-1))
        currentLine++
        for (i in currentLine..currentLine + numberOfPaths - 1) {
            line = lineList.elementAt(i-1)
            val list = line.split(" ")
            val id = Integer.parseInt(list[0])
            val linkIdList = ArrayList<Int>()

            for (i in 1 until list.size) {
                linkIdList.add(Integer.parseInt(list[i]))
            }
            val path = Path(id, linkIdList)
            listOfPaths.add(path)
        }
        var counter = start
        counter += numberOfPaths + 1
        currentLine = counter + 2
        return Demand(id, srcNode, dstNode, volume, listOfPaths)
    }
}