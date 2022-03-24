class MyQueue<T> {
    private val INIT_SIZE = 8
    private var queue = arrayOfNulls<Any>(INIT_SIZE)
    private var currentSize = 0

    fun peek(): T? {
        if (currentSize == 0)
            return null
        return queue[0] as? T
    }

    fun poll(): T? {
        if (currentSize == 0)
            return null
        --currentSize

        val result = queue[0]
        for (i in 0 until currentSize)
            queue[i] = queue[i + 1]

        if (currentSize * 4 <= queue.size && currentSize >= INIT_SIZE)
            resize(currentSize)
        return result as? T
    }

    fun element(): T? {
        if (currentSize == 0)
            throw Exception("NoSuchElementException")
        return queue[0] as? T
    }

    fun remove(): T? {
        if (currentSize == 0)
            throw Exception("NoSuchElementException")
        return poll()
    }

    fun offer(elem: Any): Boolean{
        if (currentSize == queue.size)
            resize(currentSize * 2)
        queue[currentSize++] = elem
        return true
    }

    private fun resize(newLength: Int){
        val newQueue = arrayOfNulls<Any>(newLength)
        System.arraycopy(queue, 0, newQueue, 0, currentSize)
        queue = newQueue
    }

    fun size(): Int {
        return currentSize
    }
}