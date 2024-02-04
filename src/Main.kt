fun main() {
    val tree = BinaryTree<Int>()

    tree.insertAll(5, 4, 3, 2, 1, 8, 6, 7, 10, 9)

    for(item in tree) {
        print ("$item ")
    }
}