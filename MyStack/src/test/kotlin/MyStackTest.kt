import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MyStackTest {


    @Test
    fun sizeZero() {
        var stack = MyStack<Int>()
        assertEquals(0, stack.size())
    }

    @Test
    fun sizeOne() {
        var stack = MyStack<Int>()
        stack.push(1)
        assertEquals(1, stack.size())
    }

    @Test
    fun sizeThree() {
        var stack = MyStack<Int>()
        stack.push(1)
        stack.push(1)
        stack.push(1)
        assertEquals(3, stack.size())
    }

    @Test
    fun peek() {
        var stack = MyStack<Int>()
        stack.push(123)
        var res = stack.peek()
        assertEquals(123, res)
        assertEquals(1, stack.size())
    }

    @Test
    fun pop() {
        var stack = MyStack<Int>()
        stack.push(123)
        var res  = stack.pop()
        assertEquals(123, res)
        assertEquals(0, stack.size())
    }

    @Test
    fun push() {
        var stack = MyStack<Int>()
        stack.push(123)
        assertEquals(123, stack.peek())
    }

    @Test
    fun combinedTest1() {
        var stack = MyStack<Int>()
        stack.push(1)
        stack.push(2)
        stack.push(3)
        assertAll(
            { assertEquals(3, stack.pop()) },
            { assertEquals(2, stack.pop()) },
            { assertEquals(1, stack.pop()) },
            { assertEquals(0, stack.size()) }
        )
    }

    @Test
    fun combinedTest2() {
        var stack = MyStack<Int>()
        stack.push(1)
        stack.push(2)
        stack.push(3)
        assertAll(
            { assertEquals(3, stack.peek()) },
            { assertEquals(3, stack.peek()) },
            { assertEquals(3, stack.peek()) },
            { assertEquals(3, stack.size()) }
        )
    }
}