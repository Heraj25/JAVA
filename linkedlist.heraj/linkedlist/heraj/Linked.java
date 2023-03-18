



class Node{
    int data;
    Node next;
}

class LinkedList{

    Node head;

    public void insert(int data){
        Node new_node = new Node();

        new_node.data = data;


        if(head == null){
            head = new_node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = new_node;
        }
    }

    public void show(){
        Node new_node = head;
        while(new_node.next != null){
            System.out.print(new_node.data+" ");
            new_node = new_node.next;
        }

        System.out.print(new_node.data);
    }

    
} 


class Linked{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(600);
        list.insert(400);

        list.show();
    }
}
