
public class removelist {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    //remove elements containing value >25 from the linked list;
    public void remove() {
        while(head != null && head.data > 25){
            head = head.next;
        }

        Node curr = head;
        while(curr != null && curr.next != null){
            if(curr.next.data > 25) {
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }

    }

    //printList Method
    public void printList() {
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public void removemorethan25() {
        if(head == null){
            System.out.println("Empty List.");
            return;
        }

        if(head.next == null && head.data >25) {
            head = head.next;
            return;
        }

        if(head.next != null && head.data > 25) {
            head = head.next;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr != null && curr.next != null) {
            if(curr.data > 25) {
                prev.next = curr.next;
                curr = curr.next;
            }
            curr = curr.next;
        }
    }





    //main method
    public static void main(String[] args) {
        
        int[] arr = {1, 26, 3};
        removelist list = new removelist();
        for(int i=0 ; i<arr.length; i++) {
            list.addFirst(arr[i]);
        }
        list.printList();
        // list.remove();
        list.removemorethan25();
        list.printList();
    }



}