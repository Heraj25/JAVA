


public class bst_two {
    Node root;
    
    class Node{
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
            return new Node(data);
        }

        if(data < root.data) {
            root.left = insertNode(data, root.left);
        } else if(data > root.data) {
            root.right = insertNode(data, root.right);
        }
        return root;
    }

    void delete(int data) {
        root = deleteNode(data, root);
    }

    Node deleteNode(int data, Node root) {

        if(root == null) 
            return root;
        if(data < root.data) {
            root.left = deleteNode(data, root.left);
        } else if(data > root.data) {
            root.right = deleteNode(data, root.right);
        } else {
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            else {
                root.data = minVal(root.right);
                root.right = deleteNode(root.data, root.right);
            }
            
        }
        return root;
    }

    int minVal(Node root) {
        int minValue = root.data;

        while(root.left != null) {
            root = root.left;
            minValue = root.data;
        }
        return minValue;
    }

    void preOrder() {
        System.out.println("printing PreOrder Nodes");
        preOrderNode(root);
    }
    void preOrderNode(Node root) {
        if(root != null) {
            System.out.println(root.data);
            preOrderNode(root.left);
            preOrderNode(root.right);
        }
    }

    void inOrder() {
        System.out.println("printing InOrder Nodes");
        inOrderNode(root);
    }
    void inOrderNode(Node root) {
        if(root != null) {
            inOrderNode(root.left);
            System.out.println(root.data);
            inOrderNode(root.right);
        }
    }

    void postOrder() {
        System.out.println("printing PostOrder Nodes");
        postOrderNode(root);
    }
    void postOrderNode(Node root) {
        if(root != null) {
            postOrderNode(root.left);
            postOrderNode(root.right);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        bst_two obj = new bst_two();

        obj.insert(45);
        obj.insert(67);
        obj.insert(89);
        obj.insert(56);
        obj.insert(78);
        obj.preOrder();
        
        obj.inOrder();
        obj.postOrder();
        obj.delete(56);
        obj.inOrder();
    }

}


