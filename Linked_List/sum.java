package linked_list;

class LinkedL {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;

    }

    public void printList() {
        Node curr = head;

        //corner case
        if(head == null)
        {
            System.out.println("It is an empty list");
            return;
        }

        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.print(" null");
        System.out.println();
    }


    public void removeFirst() {
        if(head == null || head.next == null) {
            System.out.println("THis is an empty list.");
            return;
        }
        head = head.next;
    }

    public void removeLast() {

        if(head == null) {
            System.out.println("This is an empty list.");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr.next != null) {
            curr = curr.next;
            prev = prev.next;
        }
        prev.next = null;
    }


    public void solution() {
        Node temp = head;
        int count = 0;

        while(temp != null) {
            ++count;
            temp = temp.next;
        }

        int[] arr= new int[count];
        temp = head;
        
        for(int k=0 ;k<count ; k++) {
            arr[k] = temp.data;
            temp = temp.next;
        }

        int start = 0;
        int end = count-1;

        int i=0;
        while(start < end) {
            arr[i++] = arr[start]+arr[end];
            start++;
            end--;
        }
        System.out.println("This is the output of the solution method: ");
        for(int j=0 ; j<count ; j++) {
            System.out.println(arr[j]);
        }
    }
}

public class sum {
    public static void main(String[] args) {
        LinkedL list = new LinkedL();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(5);
        list.addLast(11);
        list.addLast(13);
        list.printList();

        list.solution();
        
    }
}
