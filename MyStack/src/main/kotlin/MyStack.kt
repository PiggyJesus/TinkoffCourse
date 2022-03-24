class MyStack<T> {
    private val INIT_SIZE = 8
    private var stack = arrayOfNulls<Any>(INIT_SIZE)
    private var currentSize = 0

    fun peek(): T? {
        if (currentSize == 0)
            return null
        return stack[currentSize - 1] as? T
    }

    fun pop(): T? {
        if (currentSize == 0)
            return null
        --currentSize
        if (currentSize * 4 <= stack.size && currentSize >= INIT_SIZE)
            resize(currentSize)
        return stack[currentSize] as? T
    }

    fun push(elem: Any){
        if (currentSize == stack.size)
            resize(currentSize * 2)
        stack[currentSize++] = elem
    }

    private fun resize(newLength: Int){
        val newStack = arrayOfNulls<Any>(newLength)
        System.arraycopy(stack, 0, newStack, 0, currentSize)
        stack = newStack
    }

    fun size(): Int {
        return currentSize
    }
}