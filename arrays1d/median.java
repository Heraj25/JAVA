package arrays1d;

import java.util.Scanner;

class median{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();

        }

        //sorting the 1d array

        int temp;
      
        for(int i=0 ; i<n; i++){
            for(int j=i+1 ; j<n ;j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }


        //printing the sorted array
        System.out.println("The SORTED ARRAY IS: ");
        for(int i=0 ; i<n ;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();


        int l;
        //finding the median
        if(n%2 == 1){
            l = n/2;
            System.out.println("The median of the sorted ODD Array: "+ arr[l]);
        }
        else if(n%2 ==0){
            l = n/2;
            int avg = (arr[l]+arr[l-1])/2;
            System.out.println("The median of  the sorted array: "+avg);
        }

        sc.close();
    }
}