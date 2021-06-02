class Queue {
    private val maxSize = 10
    val items: IntArray = IntArray(maxSize)
    var arrayFront = 0
    var arrayRear = 0

    fun enqueue(n: Int) {
        if (_isEmpty()) {
            items[arrayRear] = n
            arrayRear++
        } else {
            if (arrayRear != arrayFront) {
                items[arrayRear] = n
                arrayRear++

                if (arrayRear > maxSize) arrayRear = 0
            } else {
                println("overflow")
            }
        }
    }

    fun dequeue(): Int? {
        if (arrayFront != arrayRear) {
            val front = arrayFront
            arrayFront++

            if (arrayFront > maxSize) {
                arrayFront = 0
            }
            return items[front]
        } else {
            println("overflow")
            return null
        }
    }

    fun _isEmpty(): Boolean {
        return arrayRear == arrayFront
    }
}