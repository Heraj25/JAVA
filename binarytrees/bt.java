
import java.util.*;

public class bt {
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

    static class binary {
        static int index = -1;

        // building the tree and finding the root function
        public Node buildT(int[] nodes) {
            index++;
            if (nodes[index] == -1)
                return null;

            Node newNode = new Node(nodes[index]);
            newNode.left = buildT(nodes);
            newNode.right = buildT(nodes);

            // finding and returning the root of the tree
            return newNode;
        }

        // Doing the Pre-Order Traversal RULE: Root, Left subtree, Right subtree
        public void preorder(Node root) {
            if (root == null)
                return;
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // In-Order Traversal RULE: Left subtree, Root, Right Subtree
        public void inorder(Node root) {
            if (root == null)
                return;

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // Post-Order Traversal RULE: Left subtree, Right subtree, Root
        public void postorder(Node root) {
            if (root == null)
                return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // Level-Order Traversal RULE: Breadth First Search
        public void levelorder(Node root) {
            // use Queue data structure and FIFO order
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

        public int count(Node root) {
            if (root == null)
                return 0;

            int leftnodes = count(root.left);
            int rightnodes = count(root.right);

            return leftnodes + rightnodes + 1;
        }

        // sum of the nodes
        public int sumofnodes(Node root) {
            if (root == null)
                return 0;

            int leftsum = sumofnodes(root.left);
            int rightsum = sumofnodes(root.right);

            return leftsum + rightsum + root.data;
        }

        // height of the tree
        public int height(Node root) {
            if (root == null)
                return 0;

            int leftheight = height(root.left);
            int rightheight = height(root.right);

            int myheight = Math.max(leftheight, rightheight) + 1;

            return myheight;
        }

        // diameter of the tree there are 2 methods

        // First method Time complexity is O(n^2)
        public int diam_approach1(Node root) {
            if (root == null)
                return 0;

            int diam1 = diam_approach1(root.left);
            int diam2 = diam_approach1(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;

            int maxdiam = Math.max(diam3, Math.max(diam1, diam2));
            return maxdiam;
        }

        // Second method Time complexity is O(n) for this method you have to create a
        // new class
        public class TreeInfo {
            int ht;
            int diam;

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }

        public TreeInfo diam_approach2(Node root) {
            if (root == null)
                return new TreeInfo(0, 0);

            TreeInfo leftdiam = diam_approach2(root.left);
            TreeInfo rightdiam = diam_approach2(root.right);

            int myheight = Math.max(leftdiam.ht, rightdiam.ht) + 1;

            int diam1 = leftdiam.diam;
            int diam2 = rightdiam.diam;
            int diam3 = leftdiam.ht + rightdiam.ht + 1;

            int mydiam = Math.max(diam3, Math.max(diam1, diam2));

            TreeInfo myInfo = new TreeInfo(myheight, mydiam);
            return myInfo;

        }
    }

    public static void main(String[] args) {
        int[] nodes = { 3, 5, -1, 4, -1, -1, 7, -1, -1 };
        binary tree = new binary();
        Node root = tree.buildT(nodes);
        System.out.println(root.data);
        System.out.println("PRE ORDER OUTPUT");
        tree.preorder(root);
        System.out.println();
        System.out.println("IN ORDER OUTPUT");
        tree.inorder(root);
        System.out.println();
        System.out.println("POST ORDER OUTPUT");
        tree.postorder(root);
        System.out.println();
        System.out.println("LEVEL ORDER OUTPUT");
        tree.levelorder(root);
        System.out.println();
        System.out.println("Counting the number of Nodes: " + tree.count(root));
        System.out.println();
        System.out.println("The sum of all the nodes in the BST: " + tree.sumofnodes(root));

        System.out.println();
        System.out.println("Height of the BST: " + tree.height(root));

        System.out.println();
        System.out.println("Maximum diameter of the BST Approach 1: " + tree.diam_approach1(root));

        System.out.println();
        System.out.println("Maximum diameter of the BST Approach 2: " + tree.diam_approach2(root));

    }
}
