package stack;

//Stack implementation in Java
// without the use of Stack class


public class classic {

    //store elements of the Stack
    private int arr[];

    //represents the top of the Stack
    private int top;

    //total capacity of the Stack
    private int capacity;

    //Creating a Stack using a Constructor
    classic(int size){
        //initialize the array
        //initialize the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //push the elements to the top of the Stack
    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow");

            //terminate the program
            System.exit(1);
        }

        //insert the element on top of the Stack
        System.out.println("Inserting: "+x);
        arr[++top] = x;
    }

    public int pop(){

        //if stack is empty then no element to pop
        if(isEmpty()){
            System.out.println("Stack Empty");

            //terminates the program
            System.exit(1);
        }

        //pop the elements from the top of the Stack
        return arr[top--];
    }


    public int getSize(){
        return top+1;
    }

    public Boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull() {
        return top==capacity-1;
    }

    public void printStack(){
        for(int i=0 ; i<=top; i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        classic stack = new classic(5);

        stack.push(20);
        stack.push(20);
        stack.push(20);
        stack.push(20);
        stack.push(20);

        System.out.println("STACK CONTAINS: ");
        stack.printStack();


        stack.pop();
        System.out.println("AFTER POPPING OUT THE ELEMENT FROM THE STACK: ");
        stack.printStack();

    }
}
