
import java.util.Scanner;



class Nodes{
    int data;
    Nodes next;
}

class LinkedListy{

    Nodes head;
    public void insert(int data){
        Nodes node = new Nodes();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Nodes n = head;  //reference
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Nodes node = new Nodes();
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}


public class insertbetween {

    public static void main(String[] args) {
        
        LinkedListy list = new LinkedListy();
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
