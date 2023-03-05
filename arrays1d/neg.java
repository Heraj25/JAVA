package arrays1d;

import java.util.Scanner;

class neg_elements{
    void values(int[] arr, int n){
            int store;

            int temp;
            store =arr[0];
            for(int i=1 ; i<n ; i++){
                if(store > arr[i]){
                    temp = store;
                    store = arr[i];
                    arr[i] = temp;
                }
            }
    }
}

public class neg {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of values in the array: ");
        num = sc.nextInt();

        int[] a = new int[num];
        System.out.println("Input random integers in the array : ");
        for(int i=0 ; i<num ; i++){
            a[i] = sc.nextInt();
        }

        //create an object of the public class neg_elements

        neg_elements obj = new neg_elements();

        obj.values(a, num);

        sc.close();
        
    }
    
}
