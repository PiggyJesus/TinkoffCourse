class MyQueue<T> {
    private val INIT_SIZE = 8
    private var queue = arrayOfNulls<Any>(INIT_SIZE)
    private var currentSize = 0

    fun peek(): T? {
        if (currentSize == 0)
            return null
        return queue[currentSize - 1] as? T
    }

    fun poll(): T? {
        if (currentSize == 0)
            return null
        --currentSize
        if (currentSize * 4 <= queue.size && currentSize >= INIT_SIZE)
            resize(currentSize)
        return queue[currentSize] as? T
    }

    fun element(): T? {
        if (currentSize == 0)
            throw Exception("NoSuchElementException")
        return queue[currentSize - 1] as? T
    }

    fun remove(): T? {
        if (currentSize == 0)
            throw Exception("NoSuchElementException")
        --currentSize
        if (currentSize * 4 <= queue.size && currentSize >= INIT_SIZE)
            resize(currentSize)
        return queue[currentSize] as? T
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