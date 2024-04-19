package treeself;

class TreeSelfTest {
    public static void main(String[] args) {
        Node node = new Node(15);
        TreeSelf binaryTree = new TreeSelf(node);
        binaryTree.insertNewNode(10);
        binaryTree.insertNewNode(30);
        binaryTree.insertNewNode(20);
        binaryTree.insertNewNode(35);
        binaryTree.insertNewNode(18);
        binaryTree.readTree(node);
    }

}