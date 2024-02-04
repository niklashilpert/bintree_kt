fun main() {
    val tree = BinaryTree<Int>()

    tree.insert(5)
    tree.insert(4)
    tree.insert(3)
    tree.insert(2)
    tree.insert(1)
    tree.insert(0)

    for(item in tree) {
        print ("$item ")
    }
}