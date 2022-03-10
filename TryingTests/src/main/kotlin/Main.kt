fun main(args: Array<String>) {
    val pen = Pen(50, "green", 100)
    val pencil = Pencil(50, "blue", 100)

    var plane = ToyPlane(pencil, pen)
    println(plane.tryFly())
}