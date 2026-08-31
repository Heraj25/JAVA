package bst;

public class binarytree {
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

    void insert(int data) {
        root = insertNode(root, data);
    }

    Node insertNode(Node root, int data) {
        if (root == null)
            root = new Node(data);

        if (data < root.data)
            root.left = insertNode(root.left, data);
        else if (data > root.data)
            root.right = insertNode(root.right, data);

        return root;
    }

    void preOrder() {
        System.out.println("PRE ORDER TRAVERSAL");
        preOrderNode(root);
    }

    void preOrderNode(Node root) {
        if (root != null) {
            System.out.println(root.data);
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
            inOrderNode(root.left);
            System.out.println(root.data);
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
            System.out.println(root.data);
        }
    }

    int minValue() {
        int minVal = root.data;
        Node curr = root;
        while (curr.left != null) {
            curr = curr.left;
            minVal = curr.data;
        }

        System.out.println("The minimum value of the Binary Search Tree: " + minVal);
        return minVal;
    }

    void maxValue() {
        int maxVal = root.data;
        Node curr = root;
        while (curr.right != null) {
            curr = curr.right;
            maxVal = curr.data;
        }
        System.out.println("The maximum value of the Binary Search Tree: " + maxVal);
    }

    void delete(int data) {
        root = deleteNode(root, data);
    }

    Node deleteNode(Node root, int data) {
        if (root == null)
            return root;

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = findMin(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    int findMin(Node root) {
        int minVal = root.data;
        Node curr = root;
        while (curr.left != null) {
            curr = curr.left;
            minVal = curr.data;
        }
        return minVal;
    }

    void searchNode(int data) {
        Node curr = root;
        while (curr != null) {
            if (data == curr.data) {
                System.out.println("The element you are searching for is present in the Binary Search Tree.");
                return;
            } else if (data < curr.data) {
                curr = curr.left;
            } else if (data > curr.data) {
                curr = curr.right;
            }
        }
        System.out.println("No such element found in the Binary Search Tree.");
    }

    public static void main(String[] args) {
        binarytree obj = new binarytree();

        obj.insert(67);
        obj.insert(45);
        obj.insert(100);

        obj.preOrder();
        obj.inOrder();
        obj.postOrder();
        obj.minValue();
        obj.maxValue();
        obj.searchNode(1030);
        obj.delete(67);
        obj.preOrder(); 
    }
}
