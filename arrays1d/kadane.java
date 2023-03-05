package arrays1d;

import java.util.Scanner;

public class kadane {

    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long sum=0;
        for(int j=0 ; j<n ; j++){
            sum = sum+arr[j];
        }

        return sum;       
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of elements in the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Input the elements in the array: ");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        //create an object
        kadane obj = new kadane();
        System.out.println("The maximum subarray sum is: "+obj.maxSubarraySum(arr, n));

        sc.close();
    }
    
}
