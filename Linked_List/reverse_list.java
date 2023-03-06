package linked_list;

class Node{
    int data;
    Node next;
}

class running{
    public static void main(String[] args) {
        
    
    reverse_list list = new reverse_list();

    list.insert(100);
    list.insert(90);
    list.insert(80);
    list.insert(70);

    list.display();

    }
}

public class reverse_list {
   
    Node head;
    
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

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

    public void insertAt(){
        
    }

    public void display(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

   
}
