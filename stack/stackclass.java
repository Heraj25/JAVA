package stack;

import java.util.Stack;

public class stackclass {
    public static void main(String[] args) {

        //creating an object of the stack class
        Stack<String> names = new Stack<>();


        //pushing the elements to the top of the Stack
        names.push("Heraj");
        names.push("manoj");
        names.push("Mani");
        names.push("Abhi");

        System.out.println(names);


        //popping an element from the top of the Stack

        names.pop();
        System.out.println(names);
    }
    
}
