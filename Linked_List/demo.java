package linked_list;

class Node{
    int data;
    Node next;
}

class DemoList {
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

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        /* 
        

        */
        Node n = head; //traverse
        for(int i=0 ; i<index - 1 ; i++){
            if(index == 0){
                insertAtStart(data);
                
            }
           
            n = n.next;
        }
        node.next = n.next;
        n.next = node;

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


public class demo{
    public static void main(String[] args) {
        
        DemoList list = new DemoList();
        list.insert(90);
        list.insert(30);
        list.insert(60);
        list.insertAtStart(40);
        list.insertAt(2, 50);
        list.insertAt(0, 25);

        list.show();

    }
}