package linked_list;


class Nod{
    int data;
    Nod next;
}

class Listnode {

    Nod head;

    public void insert(int data){
        Nod node = new Nod();
        node.data = data;
        if(head == null){
            head = node;
        }
        else{
            Nod n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Nod node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);  
    }
}

class Runner{
    public static void main(String[] args) {
        
        Listnode list = new Listnode();
        list.insert(5);
        list.insert(45);
        list.insert(90);
        list.insert(3);

        list.show();
        

    }
}
