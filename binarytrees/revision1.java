import java.util.*;

public class revision1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree {
        static int index = -1;

        public Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1)
                return null;

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void preorder(Node root) {
            if (root == null)
                return;

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root) {
            if (root == null)
                return;

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public void postorder(Node root) {
            if (root == null)
                return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public void levelorder(Node root) {
            // Using Queue data structure along with the FIFO, doing the Breadth First
            // Search
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }

        }

        // count number of nodes

        // sum of the nodes

        // height of the tree

        // diameter of the tree

    }

    public static void main(String[] args) {
        int[] nodes = { 1, 3, -1, 5, -1, -1, 6, 7, -1, -1, 8, -1, 9, -1, -1 };

        // create an object
        binarytree tree1 = new binarytree();
        Node root = tree1.buildTree(nodes);
        System.out.print(root.data);
        System.out.println();
        tree1.preorder(root);
        System.out.println();
        tree1.inorder(root);
        System.out.println();
        tree1.postorder(root);
        System.out.println();
        tree1.levelorder(root);

    }
}
