fun main(args: Array<String>) {
    val queue = Queue()

    queue.enqueue(35)
    queue.enqueue(89)
    queue.enqueue(15)
    queue.enqueue(35)
    queue.enqueue(84)

    println(queue.dequeue())
    println(queue.dequeue())
}