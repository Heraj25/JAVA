public class list_llinked {
    Node head;
    public int size = 0;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //insert a new node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //insert a new node at the ending of the list
    public void addLast(int data) {
        Node newNode = new Node(data);

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    //print the elements in the list
    public void printList() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data +" -> ");
            curr = curr.next;
        }
        System.out.println("null");
        System.out.println("The size of the linked list: "+size);
    }

    //remove a node at the beginning of the list
    public void removeFirst() {
        if(head == null) {
            System.out.println("The linked list is Empty");
            return;
        }
        head = head.next;
        size--;
    }

    //remove a node at the end of the list
    public void removeLast() {
        if(head == null) {
            System.out.println("The linked list is empty");
            return;
        }

        if(head.next == null) {
            head = head.next;
            size--;
            return;
        }

        Node prev = head;
        Node curr = prev.next;

        while(curr.next != null) {
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = null;
        size--;
    }


    public static void main(String[] args) {
        list_llinked obj = new list_llinked();

        obj.addFirst(45); 
        obj.addFirst(40);
        obj.addLast(50);
        obj.printList();

        obj.removeFirst();
        obj.printList();
        obj.removeLast();
        obj.printList();
        obj.removeLast();
        obj.printList();
        obj.removeFirst();
    }
}
