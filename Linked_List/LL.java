package linked_list;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("heraj");
        list.addLast("manoj");
        list.addFirst("mani");

        for(int i=0 ; i<list.size() ; ++i) {
            System.out.print(list.get(i)+" --> ");
        }
        System.out.print("null");
    }
    
}
