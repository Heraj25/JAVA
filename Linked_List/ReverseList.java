package linked_list;

class Noder{
    int data;
    Noder next;
}

class running{
    public static void main(String[] args) {
        
    
    ReverseList list = new ReverseList();

    list.insert(100);
    list.insert(90);
    list.insert(80);
    list.insert(70);

    list.display();

    }
}

public class ReverseList {
   
    Noder head;
    
    public void insert(int data){
        Noder node = new Noder();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Noder n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAt(){
        
    }

    public void display(){
        Noder node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

   
}
