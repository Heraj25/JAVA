
import  java.util.Scanner;
public class listnode {
    listNode head;
    private int size;    

    listnode() {
        size=0;
    }

    public class listNode{
        int data;
        listNode next;

        listNode(int data) {
            this.data = data;
            this.next = null;

            size++;    
        }
        
    }

    public void addFirst(int data) {
        listNode newNode = new listNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        listNode newNode = new listNode(data);

        if(head == null){
            head = newNode;
            return;
        }

        listNode lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void printList() {
        listNode curr = head;

        while(curr.next != null){
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }

        System.out.print("null");
        System.out.println();
    }


    public void removeFirst() {
        if(head == null){
            System.out.println("Empty List. Nothing is there to remove.");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        head = head.next;


    }

    public void removeLast() {
        if(head == null){
            System.out.println("Empty list. Nothing is there to remove");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        listNode curr = head;
        listNode last = head.next;

        while(last.next != null){
            curr = curr.next;
            last = last.next;
        }

        curr.next = null;

    }

    public void search(int k) {
        if(head == null){
            System.out.println("Empty List. Nothing here to search for!!");
            return;
        }
        int index=0;

        listNode curr = head;

        while(curr != null){
            if(k == curr.data)
                System.out.println("The element "+k+" is found at the following index position from the list: "+index);
            
            curr = curr.next;
            ++index;
        }   
    }

    public int getSize() {
        return size;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr= {1,2,3,4,5,6,7};
        listnode obj = new listnode();
        for(int i=0 ; i<arr.length ; i++){
            obj.addLast(arr[i]);
        }

        obj.printList();
        System.out.println();
        obj.removeLast();

        obj.printList();

        int k;
        System.out.println("Enter the element you want to search for: ");
        k = sc.nextInt();

        obj.search(k);
        sc.close();


    }  
}
