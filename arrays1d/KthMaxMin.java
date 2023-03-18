package arrays1d;

import java.util.Scanner;

class max{
    Scanner sc = new Scanner(System.in);
    void kth_max(int[] arr, int n){
        int temp = arr[0];

       

        System.out.println("Sorting the elements of the array in DESCENDING ORDER");
        int j=0;
        for(int i=1; i<n ; i++){
            if(arr[i] > temp){
                arr[j++] = arr[i];
                arr[i] = temp;
                temp = arr[j];
            }
        }

        System.out.println();

        System.out.println("Input the K th value of the maximum element in the array: ");
        int a = sc.nextInt();

        System.out.println();

        for(int l=0 ; l<n ; l++){
            if(a == l){
                System.out.println("The "+a+" highest element in the array: "+arr[l]);
            }
        }

       
    }

}

class min{
    Scanner sc = new Scanner(System.in);
    void kth_min(int[] arr, int n){
        int temp = arr[0];
        int j=0;
        System.out.println("Sorting the elements of the array in ASCENDING ORDER");
        for(int i=1; i<n ; i++){
            if(arr[i] < temp){
                arr[j++] = arr[i];
                arr[i] = temp;
                temp = arr[j];
            }
        }
        System.out.println();

        System.out.println("Input the K th value of the minimum element in the array: ");
        int g = sc.nextInt();

        System.out.println();
        for(int l=0 ; l<n ; l++){
            if(g == l){
                System.out.println("The "+g+" smallest element in the array: "+arr[l]);
            }
        }

        sc.close();
    }

}

public class KthMaxMin{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the total number of elements in the array: ");
        num = sc.nextInt();

        System.out.println();

        int[] ar = new int[num];
        System.out.println("Input the elements in the array: ");
        for(int i=0 ; i<num ; i++){
            ar[i] = sc.nextInt();
        }
        
        /* Create respective objects of the respective classes */
        max obj = new max();

        min newobj = new min();

        System.out.println(" The Kth MAX element investigation Begins ");

        obj.kth_max(ar, num);

        System.out.println(" The Kth MIN element investigation Begins ");

        newobj.kth_min(ar, num);

        sc.close();        
    }
}