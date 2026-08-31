package bst;



class BST {
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
        root = insertNode(data, root);
    }
    
    Node insertNode(int data, Node root) {
        if(root == null) {
            root = new Node(data);
            return root;
        }
        
        if(data < root.data) {
            root.left = insertNode(data, root.left);
        } else if(data > root.data) {
            root.right = insertNode(data, root.right);
        }
        return root;
    }
    
    void min() {
        int val = minValue(root);
         System.out.println(val);
    }
    
    int minValue(Node root) {
        int minv = root.data;
        while(root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
       
        return minv;
    }
    
    void preOrder() {
        preOrderNode(root);
        System.out.println();
    }
    
    void preOrderNode(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrderNode(root.left);
            preOrderNode(root.right);
        }
    }
    
    void inOrder() {
        inOrderNode(root);
        System.out.println();
    }
    
    void inOrderNode(Node root) {
        if(root != null) {
            inOrderNode(root.left);
            System.out.print(root.data + " ");
            inOrderNode(root.right);
        }
    }
    
    void postOrder() {
        postOrderNode(root);
        System.out.println();
    }
    
    void postOrderNode(Node root) {
        if(root != null) {
            postOrderNode(root.left);
            postOrderNode(root.right);
            System.out.print(root.data + " ");
        }
    }
}


public class bst_one {
    public static void main(String[] args) {
        BST obj = new BST();
        
        obj.insert(45);
        obj.insert(35);
        obj.insert(56);
        obj.insert(109);
        obj.insert(23);
        obj.insert(119);
        obj.insert(99);
        obj.insert(67);
        obj.preOrder();
        obj.inOrder();
        obj.postOrder();
        obj.min();
    }
}
