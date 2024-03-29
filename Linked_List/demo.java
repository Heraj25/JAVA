package linked_list;

class Nodey{
    int data;
    Nodey next;
}

class DemoList {
    Nodey head;
    
    public void insert(int data){
        Nodey node = new Nodey();
        node.data = data;
        node.next = null;
        
        if(head == null){
            head = node;
        }
        else{
            Nodey n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Nodey node = new Nodey();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Nodey node = new Nodey();
        node.data = data;
        node.next = null;

        /* 
        

        */
        Nodey n = head; //traverse
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
        Nodey node = head;
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