package bst;

class BstModel {
    Node root;

    class Node{
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    void insert(int key) {
        root = insertNode(key, root);
    }

    Node insertNode(int key, Node root) {
        if(root == null) {
            root = new Node(key);
            return root;
        }

        if(key < root.key) {
            root.left = insertNode(key, root.left);
        } else if(key > root.key) {
            root.right = insertNode(key, root.right);
        }
        return root;
    }

    void delete(int key) {
        root = deleteNode(key, root);
    }

    Node deleteNode(int key, Node root) {
        if(root == null)
            return root;
        
        if(key < root.key) {
            root.left = deleteNode(key, root.left);
        } else if(key > root.key) {
            root.right = deleteNode(key, root.right);
        } else {
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            } else {
                root.key = minValue(root.right);
                root = deleteNode(root.key, root.right);
            }
        }
        return root;
    }



    int minValue(Node root) {
        int minVal = root.key;

        while(root.left != null) {
            root = root.left;
            minVal = root.key;
        }

        return minVal;
    }

    void preOrder() {
        System.out.println("The Pre Order of the Binary Search Tree: ");
        preOrderNodes(root);
    }

    void preOrderNodes(Node root) {
        if(root != null) {
            System.out.print(root.key + " -> ");
            preOrderNodes(root.left);
            preOrderNodes(root.right);
        }
    }

    void inOrder() {
        System.out.println("The In Order of the Binary Search Tree: ");
        inOrderNodes(root);
    }

    void inOrderNodes(Node root) {
        if(root != null) {
            preOrderNodes(root.left);
            System.out.print(root.key + " -> ");   
            preOrderNodes(root.right);
        }
    }

    void postOrder() {
        System.out.println("The Post Order of the Binary Search Tree: ");
        postOrderNodes(root);
    }

    void postOrderNodes(Node root) {
        if(root != null) {
            preOrderNodes(root.left);
            preOrderNodes(root.right);
            System.out.print(root.key + " -> ");
        }
    }
}

public class BstTwo {
    public static void main(String[] args) {
        BstModel modelObj = new BstModel();

        modelObj.insert(45);
        modelObj.insert(56);
        modelObj.insert(23);
        modelObj.insert(89);
        modelObj.insert(100);
        modelObj.insert(5);
        System.out.println();
        modelObj.preOrder();
        System.out.println();
        modelObj.inOrder();
        System.out.println();
        modelObj.postOrder();
        System.out.println();
        modelObj.delete(56);
        System.out.println();
        modelObj.preOrder();
    }
}