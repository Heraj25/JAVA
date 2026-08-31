import java.util.*;

class bst {
    Node root;

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

    void delete(int data) {
        deleteNode(root, data);
    }

    Node deleteNode(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                root.data = minValue(root.right);
                deleteNode(root.right, root.data);
            }
        }
        return root;
    }

    int minValue(Node root) {
        int min = root.data;

        while (root.left != null) {
            root = root.left;
            min = root.data;
        }
        return min;
    }

    void preOrder() {
        System.out.println("Pre-Order Traversal of the BST");
        preOrderNode(root);
        System.out.println();
    }

    void preOrderNode(Node root) {
        if (root != null) {
            System.out.print(root.data + " -> ");
            preOrderNode(root.left);
            preOrderNode(root.right);
        }
        // System.out.print("null");
    }

    void inOrder() {
        System.out.println("In-Order Traversal of the BST");
        inOrderNode(root);
        System.out.println();
    }

    void inOrderNode(Node root) {
        if (root != null) {
            inOrderNode(root.left);
            System.out.print(root.data + " -> ");
            inOrderNode(root.right);
        }
        // System.out.print("null");
    }

    void postOrder() {
        System.out.println("Post-Order Traversal of the BST");
        postOrderNode(root);
        System.out.println();
    }

    void postOrderNode(Node root) {
        if (root != null) {

            postOrderNode(root.left);
            postOrderNode(root.right);
            System.out.print(root.data + " -> ");
        }
        // System.out.print("null");
    }

    void countNodesInRange(int l, int h) {
        System.out.println("The Count of nodes present in the range: " + countNodes(root, l, h));
    }

    int countNodes(Node root, int l, int h) {
        if (root == null) {
            return 0;
        }

        if (root.data >= l && root.data <= h) {
            return 1 + countNodes(root.left, l, h) + countNodes(root.right, l, h);
        } else if (root.data < l) {
            return countNodes(root.right, l, h);
        } else if (root.data > h) {
            return countNodes(root.left, l, h);
        }
        return 0;
    }

    void evenNodes() {
        ArrayList<Integer> evenList = new ArrayList<>();
        evenNodesList(root, evenList);
        System.out.println("Even Nodes List from the given BST");
        for (int i = 0; i < evenList.size(); i++) {
            System.out.print(evenList.get(i) + " -> ");
        }
    }

    void evenNodesList(Node root, ArrayList<Integer> evenList) {
        if (root != null) {
            if (root.data % 2 == 0) {
                evenList.add(root.data);
            }
            evenNodesList(root.left, evenList);
            evenNodesList(root.right, evenList);
        }
    }

    public static void main(String[] args) {
        bst obj = new bst();
        Scanner sc = new Scanner(System.in);

        obj.insert(56);
        obj.insert(35);
        obj.insert(78);
        obj.insert(23);
        obj.insert(25);
        obj.insert(89);
        obj.insert(67);
        obj.insert(91);
        obj.insert(45);
        obj.insert(78);
        obj.insert(99);

        obj.preOrder();
        obj.inOrder();
        obj.postOrder();

        obj.delete(56);
        obj.preOrder();
        obj.inOrder();
        obj.postOrder();

        System.out.println("Enter the lowest range: ");
        int l = sc.nextInt();
        System.out.println("Enter the highest range: ");
        int h = sc.nextInt();

        obj.countNodesInRange(l, h);

        obj.evenNodes();
        sc.close();
    }
}