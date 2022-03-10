class Pencil(override val cost: Int, override var color: String, override var fill: Int) :WritingMaterials {
    private var sharpness = 2

    override fun use() {
        if (sharpness > 0) {
            fill -= 5
            sharpness--
            println("Drawn successfully, the pencil is used up by " + (100 - fill).toString() + "%.")
        }
        else {
            println("You need to sharpen the pencil first.")
        }
    }

    fun sharpenPencil() {
        sharpness = 3
        println("The pencil is sharpen! $fill% left.")
    }

    fun sharpnessInfo(): Int{
        println("$sharpness usage left.")
        return sharpness
    }
}