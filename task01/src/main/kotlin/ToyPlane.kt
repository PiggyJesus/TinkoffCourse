class ToyPlane(val body: WritingMaterials, val wings: WritingMaterials) {
    fun tryFly() {
        println("Even if body is filled by ${body.fill}% and wings is filled by ${wings.fill}%, it cant fly!")
    }
}