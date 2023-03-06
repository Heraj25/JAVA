package linked_list;



class Node{
    int data;
    Node next;
}

public class LinkedList{
    

    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        

        if(head == null){
            head = node;
        }

        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }

    }

    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

class run{
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(500);
        list.insert(600);

        list.show();
        
    }
}
