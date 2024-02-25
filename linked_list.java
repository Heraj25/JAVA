import java.util.Scanner;

public class linked_list {
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
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;

        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.print("null");
    }
    
    public void removeFirst() {

        if(head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        head = head.next;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("The linked list is empty.");
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

    public int search(int n) {
        int index = 0;

        Node currNode = head;
        while(currNode != null) {
            if(currNode.data == n){
                return index;
            }

            index++;
            currNode = currNode.next;
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create an object  of the linked_list class to obtain the properties of the functions
        linked_list list = new linked_list();
        int[] arr = {45,78,34,2,68,90,56};
        for(int nums: arr) {
            list.addLast(nums);
        }

        System.out.println("Enter the element to search the position of it present in the list: ");
        int n = sc.nextInt();

        System.out.println("The index position of the element present in the list: "+list.search(n));
        list.printList();
        sc.close();
    }
}
