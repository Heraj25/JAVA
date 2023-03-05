package arrays1d;

import java.util.Scanner;

public class union {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of elements in the first array: ");
        a= sc.nextInt();
        System.out.print("Enter the total number of elements in the second array: ");
        b = sc.nextInt();

        int[] arr = new int[a];
        int[] array = new int[b];

        System.out.println("Enter the values of the first array: ");
        for(int m =0  ; m<a ; m++){
            arr[m] = sc.nextInt();
        }


        System.out.println("Enter the values of the second array: ");
        for(int n= 0 ; n<b ; n++){
            array[n] = sc.nextInt();
        }

        sc.close();
        
        //initialize count variable

        int count = 0;

        
            
            int j=0;
            for(int i=0 ; i<a ; i++){
                for(j=0 ; j<b ; j++){
                    if(arr[i] == array[i]){
                            count = count+1;
                        }
                    else{
                            //incomplete
                        }
            }
        }
        

        System.out.println("The union of both the arrays are: ");
       
    }
    
}
