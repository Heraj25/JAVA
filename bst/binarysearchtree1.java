package bst;

public class binarysearchtree1 {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    void insertNode(int data) {

        root = insert(root, data);
    }

    Node insert(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    void preOrderNodes() {
        preOrder(root);
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " => ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        binarysearchtree1 bst = new binarysearchtree1();

        bst.insertNode(45);
        bst.insertNode(67);
        bst.insertNode(344);
        bst.insertNode(76);
        bst.insertNode(23);

        bst.preOrderNodes();
    }
}
