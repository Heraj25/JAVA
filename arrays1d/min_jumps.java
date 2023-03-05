package arrays1d;

import java.util.Scanner;

class min_jumps {
    static int minimum_jumps(int[] arr){
        int jump, jmp_count=1, i=0;
        while(i<=arr.length){
            jump=arr[i];
            i =  i+jump;
            jmp_count = jmp_count+1;
            if(jump == arr.length - 1){
                return ++jmp_count;
            }
           
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int n ; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements in the array: ");
        n = sc.nextInt();

        int[] ar = new int[n];
        System.out.println("Input the elements in the array : ");
        for(int i =0 ; i< n; i++){
            ar[i] = sc.nextInt();
        }

        System.out.println("\tINITIALIZE THE PROCESS OF MINIMAL JUMPING\t\n \n");
        System.out.println("The minimum number of jumps taken in the array : "+minimum_jumps(ar));
        sc.close();
    }
}
