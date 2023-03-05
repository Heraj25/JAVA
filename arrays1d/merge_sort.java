package arrays1d;

import java.util.Scanner;

public class merge_sort {
    static void merge(int[] arr, int[] ar, int n, int m){
        int o = n+m;
        int array[] = new int[o];
        int i = 0, j=0, k=0;

        while(i<m && j<n){
            if(arr[i] < ar[j]){
                array[k++] = arr[i++];
                array[k++] = ar[j++];
            }
            else{
                array[k++] = ar[j++];
                array[k++] = arr[i++];
            }

        }
        

        //print the elements of the array
        for(k=0 ; k<o ; k++){
            System.out.print(array[k]+" ");
        }
    }


    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        int arr[] = new int[m];
        int ar[]  = new int[n];


        System.out.println("1st ARRAY");
        for(int i=0 ; i<m ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("2nd ARRAY");
        for(int j=0 ; j<n ; j++){
            ar[j] = sc.nextInt();
        }


        

        merge(arr, ar, n, m);

        sc.close();

    }
}
