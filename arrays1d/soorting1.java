package arrays1d;

import java.util.Scanner;

public class soorting1 {

    public int[] sort(int[] arr, int n){
        
        int temp;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
    }

    return arr;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        soorting1 obj = new soorting1();
        int[] new_arr = obj.sort(arr, n);
        for(int j=0 ; j<n ; j++){
            System.out.println(new_arr[j]);
        }

    }
    
}
