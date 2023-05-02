
class Noder{
    int data;
    Noder next;

    Noder(int data, Noder next){
        this.data = data;
        this.next = next;
    }
}



public class reverse {

    public static void printList(Noder head){
        Noder ptr  = head;
        while(ptr != null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }

        System.out.println("null");
    }


    public static Noder reverseList(Noder head){
        Noder previous = null;
        Noder current = head;

        while(current != null){
            Noder next = current.next;

            previous = current;
            current = next;

        }

        return previous;
    }


    public static void main(String[] args){
        int[] keys = { 1, 2, 3, 4, 5, 6};

        Noder head = null;
        for(int i=keys.length-1 ; i>=0 ; i--){
            head = new Noder(keys[i], head);
        }


        head = reverseList(head);
        printList(head);

    }
    
}
