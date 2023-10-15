package linked_list;

import java.util.Scanner;

public class revisionLL {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null)
            lastNode = lastNode.next;

        lastNode.next = newNode;
    }

    public void printlist() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("The linked list is Empty.");
            return;
        }
        head = head.next;
    }

    public void removelast() {
        if (head == null) {
            System.out.println("The linked list is Empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        Node last = head.next;

        while (last.next != null) {
            curr = curr.next;
            last = last.next;
        }
        curr.next = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        revisionLL list = new revisionLL();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i : arr) {
            list.addlast(i);
        }

        list.printlist();
        System.out.println(

        );
        System.out.println("the element deleted from the last: ");
        list.removelast();
        list.printlist();
        sc.close();

    }
}
