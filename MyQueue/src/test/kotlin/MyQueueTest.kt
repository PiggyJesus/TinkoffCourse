import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MyQueueTest {

    @Test
    fun size() {
        var queue = MyQueue<Int>()
        assertEquals(0, queue.size())
    }

    @Test
    fun peek() {
        var queue = MyQueue<Int>()
        queue.offer(123)
        var res = queue.peek()
        assertEquals(123, res)
        assertEquals(1, queue.size())
    }

    @Test
    fun poll() {
        var queue = MyQueue<Int>()
        queue.offer(123)
        var res  = queue.poll()
        assertEquals(123, res)
        assertEquals(0, queue.size())
    }

    @Test
    fun element() {
        var queue = MyQueue<Int>()
        queue.offer(123)
        var res = queue.element()
        assertEquals(123, res)
        assertEquals(1, queue.size())
    }

    @Test
    fun remove() {
        var queue = MyQueue<Int>()
        queue.offer(123)
        var res  = queue.remove()
        assertEquals(123, res)
        assertEquals(0, queue.size())
    }

    @Test
    fun offer() {
        var queue = MyQueue<Int>()
        assertEquals(true, queue.offer(123))
        assertEquals(123, queue.peek())
    }
}