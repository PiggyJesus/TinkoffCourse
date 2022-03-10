class ToyPlane(val body: Pencil, val wings: Pen) {
    fun tryFly(): Boolean {
        return body.sharpnessInfo() > 1 && wings.fill < 50
    }
}