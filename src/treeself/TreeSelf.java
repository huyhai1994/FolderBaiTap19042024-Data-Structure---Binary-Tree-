package treeself;

class TreeSelf {
    public Node root;

    public TreeSelf(Node root) {
        this.root = root;
    }

    public Node createAnNewNode(int data) {
        Node newNode = new Node(data);
        return newNode;
    }

    public Node insertNewNode(int data) {
        Node newNode = new Node(data);
        Node pointerTrackTheLocationOfInsertedNode = this.root;
        Node pointerBehindTheTrackingPointer = pointerTrackTheLocationOfInsertedNode;
        boolean isTreeHasNoNode = this.root == null;
        if (isTreeHasNoNode) {
            this.root = newNode;
        }
        while (pointerTrackTheLocationOfInsertedNode != null) {
            pointerBehindTheTrackingPointer = pointerTrackTheLocationOfInsertedNode;
            if (newNode.data < pointerTrackTheLocationOfInsertedNode.data) {
                pointerTrackTheLocationOfInsertedNode = pointerTrackTheLocationOfInsertedNode.left;
            } else if (newNode.data > pointerTrackTheLocationOfInsertedNode.data) {
                pointerTrackTheLocationOfInsertedNode = pointerTrackTheLocationOfInsertedNode.right;
            }

        }
        boolean isInsertedNodeValueSmallerThanInsertingPointerData = pointerBehindTheTrackingPointer.data > newNode.data;
        if (isInsertedNodeValueSmallerThanInsertingPointerData) {
            pointerBehindTheTrackingPointer.left = newNode;
        } else {
            pointerBehindTheTrackingPointer.right = newNode;
        }
        return this.root;

    }

    public void readTree(Node node) {
        boolean isTreeHasNoNode = node == null;
        if (isTreeHasNoNode) {
            return;
        }
        System.out.println(node.data);
        readTree(node.left);
        readTree(node.right);
    }

}