


fun main() {

    val queue = MyQueue<Int>()
    println(queue.offer("abc"))
    println(queue.offer(123))
    println(queue.offer(false))
    println(queue.remove())
    println(queue.poll())
    println(queue.remove())
    println(queue.remove())
}
