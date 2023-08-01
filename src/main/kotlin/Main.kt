fun main() {


}
interface TV{
    fun power()

    fun adjustVol(level: Int)

    fun switchChannel(channel: Int)
}

class Sony: TV{
    override fun power() {
        TODO("Not yet implemented")
    }

    override fun adjustVol(level: Int) {
        TODO("Not yet implemented")
    }

    override fun switchChannel(channel: Int) {
        TODO("Not yet implemented")
    }
}

abstract class Television{
//    if functiion has a body {with concrete body}, it loses the absctract function declaration
   abstract fun power()

    fun adjustVol(level: Int){
        println("Set tv volume to $level")
    }

    abstract fun switchChannel(channel: Int)
}
class Hisense: Television (){
    override fun power() {
        TODO("Not yet implemented")
    }

    override fun switchChannel(channel: Int) {
        TODO("Not yet implemented")
    }
}