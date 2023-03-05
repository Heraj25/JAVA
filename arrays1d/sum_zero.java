package arrays1d;

import java.util.Scanner;

public class sum_zero {

    static boolean findsum(int arr[],int n)
    {
        //Your code here
        boolean flag;
        for(int i=0; i<n ; i++){
            if(arr[i] == 0){
                flag = true;
                return flag;
            }
            else{

                
            }
        }
        flag = false;
        return flag;


    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(findsum(arr, n));
        sc.close();
    }
    
}
