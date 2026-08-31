

public class linkedL {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertAtFirst(int data) {
        if(head == null) {
            head = new  Node(data);
            return;
        }

        Node curr = head;

        head = new Node(data);
        head.next = curr;
        
    }

    void insertAtEnd(int data) {
        if(head == null) {
            head = new Node(data);
            return;
        }

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);        
    }

    void deleteAtFirst() {
        if(head == null)
            return;

        head = head.next;
    }

    void deleteAtEnd() {
        if(head == null)    
            return;
        
        if(head.next == null) {
            head = head.next;
        }

        Node prev = head;
        Node curr = prev.next;

        while(curr.next != null) {
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = null;
    }

    void printLinkedList() {
        Node curr = head;
        System.out.println("Printing the Linked List");
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        linkedL obj = new linkedL();
        obj.insertAtFirst(45);
        obj.insertAtEnd(67);
        obj.insertAtEnd(56);
        obj.printLinkedList();
        obj.deleteAtEnd();
        obj.printLinkedList();
        obj.deleteAtFirst();
        obj.printLinkedList();

    }
}
