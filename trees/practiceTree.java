package trees;

import java.util.*;

class Node {
    int data;
    List<Node> children;

    Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class practiceTree {
    // Add element in the tree
    public static void addElement(Node parent, Node child) {
        parent.children.add(child);
    }

    // print all the parents in a tree
    public static void printParents(Node node, Node parent) {
        if(parent == null)
            System.out.println(node.data + " -->  NULL");
        else
            System.out.println(node.data + " --> " + parent.data);

        for(Node child: node.children)
            printParents(child, node);
    }

    // Print all the children in the tree
    public static void printChildren(Node node) {
        System.out.print(node.data + "  -->  ");
        for(Node child: node.children) 
            System.out.print(child.data + "  ");

        for(Node child: node.children)
            printChildren(child);
    }

    // Print the leaf nodes in the tree
    public static void printLeadNodes(Node node){
        if(node.children.isEmpty())
            System.out.println(node.data);
        for(Node child: node.children)
            printLeadNodes(child);
    }

    // Print the degree of each node in the tree
    public static void printDegrees(Node node) {
        int degree = node.children.size();

        System.out.println(node.data + " --> " + degree);

        for(Node child: node.children)
                printDegrees(child);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node r1 = new Node(2);
        Node r2 = new Node(3);
        Node r3 = new Node(4);
        Node r4 = new Node(5);
        Node r5 = new Node(6);

        addElement(root, r1);
        addElement(root, r2);
        addElement(r1, r3);
        addElement(r2, r4);
        addElement(r2, r5);

        printParents(r2, r5);

    }
}
