package bst;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class binarysearchtree2 {
    Node root;

    void insert(int val) {
        root = insertNode(root, val);
    }

    Node insertNode(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else if (val > root.val) {
            root.right = insertNode(root.right, val);
        }

        return root;
    }

    void delete(int val) {
        if (root == null) {
            System.out.println("No Node to delete in this Binary Search Tree.");
            return;
        }
        root = deleteNode(root, val);
    }

    Node deleteNode(Node root, int val) {

        if (val < root.val) {
            root.left = deleteNode(root.left, val);
        } else if (val > root.val) {
            root.right = deleteNode(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.val = findMinVal(root.right);

                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }

    int findMinVal(Node root) {
        int minValue = root.val;
        Node curr = root;
        while (root.left != null) {
            curr = curr.left;
            minValue = curr.val;
        }
        return minValue;
    }

    void preOrder() {
        System.out.println("PRE ORDER TRAVERSAL");
        preOrderNode(root);
    }

    void preOrderNode(Node root) {
        if (root != null) {
            System.out.println(root.val);
            preOrderNode(root.left);
            preOrderNode(root.right);

        }
    }

    void inOrder() {
        System.out.println("IN ORDER TRAVERSAL");
        inOrderNode(root);
    }

    void inOrderNode(Node root) {
        if (root != null) {
            preOrderNode(root.left);
            System.out.println(root.val);
            inOrderNode(root.right);

        }
    }

    void postOrder() {
        System.out.println("POST ORDER TRAVERSAL");
        postOrderNode(root);
    }

    void postOrderNode(Node root) {
        if (root != null) {
            postOrderNode(root.left);
            postOrderNode(root.right);
            System.out.println(root.val);

        }
    }

    public static void main(String[] args) {
        binarysearchtree2 obj = new binarysearchtree2();

        obj.insert(23);
        obj.insert(45);
        obj.insert(67);
        obj.insert(100);
        obj.insert(12);

        obj.preOrder();
        obj.inOrder();
        obj.postOrder();

        obj.delete(67);
        obj.preOrder();

    }
}
