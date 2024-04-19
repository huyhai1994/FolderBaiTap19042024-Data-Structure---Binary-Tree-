package treeself;

import model.Node;

public class MyTreeTest {
    public static void main(String[] args) {
        model.Node node = new Node(15);
        MyTree myTree = new MyTree(node);
        myTree.insert(10);
        myTree.insert(15);
        myTree.insert(30);
        myTree.insert(24);
        myTree.insert(25);
        myTree.readTree(node);

    }


}
