package binarytree

internal class Node<T: Comparable<T>>(val data: T, internal var left: Node<T>?, internal var right: Node<T>?) {
    fun insert(data: T): Boolean {
        return if (data == this.data) {
            false
        } else if (data < this.data) {
            if (left != null) {
                left!!.insert(data)
            } else {
                left = Node(data, null, null)
                true
            }
        } else {
            if (right != null) {
                right!!.insert(data)
            } else {
                right = Node(data, null, null)
                true
            }
        }
    }

    fun contains(data:T): Boolean {
        return if (data == this.data) {
            true
        } else if (data < this.data) {
            if (left != null) {
                left!!.contains(data)
            } else {
                false
            }
        } else {
            if (right != null) {
                right!!.contains(data)
            } else {
                false
            }
        }
    }
}
