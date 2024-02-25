import java.util.Scanner;

public class listlinked {
    Node head;

    static int size = 0;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

            ++size;
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

        Node lastNode = head;

        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;

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
        if(head == null){
            System.out.println("Empty Linked list. Nothing to remove.");
            return;
        }

        head = head.next;
        size--;
    }

    public void removeLast() {

        if(head == null || head.next == null){
            System.out.println("Empty Linked list. Nothing to remove.");
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;
        size--;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;

    }


    public int search(int data) {
        if(head == null) {
            return -1;
        }

        int index = 0;
        Node currNode = head;
        while(currNode != null) {
            if(currNode.data == data)
                return index;
            
                ++index;
                currNode = currNode.next;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listlinked LL = new listlinked();

        int[] arr = {3,5,2,6,5,8,1};

        for(int i: arr) {
            LL.addLast(i);
        }
        // LL.removeFirst();
        // LL.removeLast();
        LL.printList();

        System.out.println("The size of the linked list: "+size);

        System.out.println("Enter the value of the element you want to search in the linked list: ");
        int n = sc.nextInt();

        System.out.print("The index position of the element in the linked list: "+LL.search(n));
        sc.close();
    }
}
