import java.util.Scanner;

public class practicelinkedlist {
    Node head;


    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode  = currNode.next;
        }

        currNode.next = newNode;
    }


    public void printList() {

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public void removeFirst() {
        if(head == null) {
            System.out.println("There are no elements present in the linked list. The list is empty.");
            return;
        }
        head = head.next;

    }

    public void removeLast() {
        if(head == null) {
            System.out.println("There are no elements present in the linked list. The list is empty.");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,5,3,6,2,8,9,7,1};
        practicelinkedlist LL = new practicelinkedlist();

        for(int num: arr) {
            LL.addFirst(num);
        }

        LL.printList();
        sc.close();
    }

}
