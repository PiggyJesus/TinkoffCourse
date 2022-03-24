fun main() {

    var myStack = MyStack<Int>()
    myStack.push(123)
    myStack.push("abs")
    myStack.push(true)
    println(myStack.peek())
    println(myStack.pop())
    println(myStack.pop())
    println(myStack.pop())
}

