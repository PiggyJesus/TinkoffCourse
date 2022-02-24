fun main(args: Array<String>) {

    val pen = Pen(50, "blue", 100)
    val pencil = Pencil(20, "red", 100)

    val drawSet = listOf(pen, pencil)
    drawSet.forEach {
        for (i in 1..3) {
            it.use()
        }
    }

    println()
    pencil.sharpenPencil()
    pencil.use()

    println()
    pen.refill("green")
    pen.use()

    println()
    val toyPlane = ToyPlane(pen, pencil)
    toyPlane.tryFly()
    toyPlane.body.use()
    pen.use()
}