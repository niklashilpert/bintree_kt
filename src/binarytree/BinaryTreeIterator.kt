package binarytree

import java.util.ArrayDeque

internal class BinaryTreeIterator<T: Comparable<T>> internal constructor(start: Node<T>?) : Iterator<T> {
    private val stack = ArrayDeque<Node<T>>()

    init {
        var current = start
        while (current != null) {
            stack.push(current)
            current = current.left
        }
    }

    override fun hasNext(): Boolean {
        return stack.isNotEmpty()
    }

    override fun next(): T {
        if (!hasNext()) {
            throw ArrayIndexOutOfBoundsException("The iterator has no next value")
        } else {
            val current = stack.pop()
            if (current.right != null) {
                var next = current.right
                while (next != null) {
                    stack.push(next)
                    next = next.left
                }
            }
            return current.data
        }
    }
}