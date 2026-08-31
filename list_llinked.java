import java.util.*;

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

    //searching the position of an element in the linked list
    public void search(int n) {
        Node curr = head;
        int count = 0;

        while(curr != null) {
            if(curr.data == n) {   
                System.out.println("The element is present in the linked list at the position: "+count);
                return;
            } else {
                curr = curr.next;
                count++;
            }
        }
        System.out.println("The element is not present in the linked list.");
    }

    //sorting the linked list ---------->>>>>>> incomplete
    public void sorting() {
        Node curr = head;
        int count = 0;

        while(curr != null) {
            curr = curr.next;
            ++count;
        }
        System.out.println(count);

        // int[] arr = new int[count]; 

        // List<Integer> result = new LinkedList<>();

    }

    //insert the new element at the sorted position
    public void insert(int n) {
        Node curr = head;
         
        Node newNode = new Node(n);
        while(curr.next != null) {
            if(curr.data > n) {
                head = newNode;
                head.next = curr;
            }
            
            else if(curr.data <= n && curr.next.data >= n) {
                newNode.next = curr.next.next;
                curr.next = newNode;
            }

            else {
                curr.next = newNode;
            }
        }
        return;
    }


    public static void main(String[] args) {
        list_llinked obj = new list_llinked();

        obj.addFirst(45); 
        obj.addFirst(40);
        obj.addLast(50);
        obj.printList();

        // obj.removeFirst();
        // obj.printList();
        // obj.removeLast();
        // obj.printList();
        // obj.removeLast();
        // obj.printList();
        // obj.removeFirst();

        System.out.println("Finding the elements position in the linked list");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search for from the linked list: ");
        int n = sc.nextInt();
        //Searching the element in the linked list
        obj.search(n);

        //sorting the linked list - ascending order
        //obj.sorting();

        System.out.println("Enter the element to insert into the linked list: ");
        int x = sc.nextInt();
        //insert the element at the sorted position
        obj.insert(x);
        obj.printList();

        sc.close();
    }
}
