
import java.util.Scanner;



class Node{
    int data;
    Node next;
}

class LinkedList{

    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;  //reference
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node node = new Node();
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}


public class insertbetween {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        int x;
        //       int n=10;
        Scanner sc = new Scanner(System.in);
        for(int i=1 ; i<=10 ; i++){
            x = sc.nextInt();
            list.insert(x);
        }
        list.show();
        sc.close();
    }
    
}
