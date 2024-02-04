import binarytree.BinaryTreeIterator
import binarytree.Node

class BinaryTree<T: Comparable<T>> : Iterable<T>{

    private var root: Node<T>? = null


    fun contains(data: T): Boolean {
        if (root != null) {
            return root!!.contains(data)
        } else {
            return false
        }
    }

    fun insert(data: T): Boolean {
        if (root != null) {
            return root!!.insert(data)
        } else {
            root = Node(data, null, null)
            return true
        }
    }

    fun insertAll(vararg items: T) {
        for (item in items) {
            insert(item)
        }
    }

    override fun iterator(): Iterator<T> {
        return BinaryTreeIterator(root)
    }

}


