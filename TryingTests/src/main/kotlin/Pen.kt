open class Pen(override val cost: Int, override var color: String, override var fill: Int) : WritingMaterials {

    fun refill(){
        fill = 100
        println("The pen is filled!")
    }

    fun refill(newColor: String){
        fill = 100
        color = newColor
        println("The pen is filled! New color is $color.")
    }

    override fun use() {
        fill -= 2
        println("Written successfully, the pen is used up by " + (100 - fill).toString() + "%")
    }


}