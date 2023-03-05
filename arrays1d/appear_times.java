package arrays1d;

import java.util.Scanner;

class print_appear{
    void printing(int[] a, int m){

        int count = 0;

        for(int i=0; i<a.length ; i++){
            for(int j=i+1 ;j<a.length ; j++ ){
                if(a[i] == a[j]){
                    count = count+1;

                }
                if(count > m){
                    System.out.println(a[i]);
                    count = 0;
                }
                
            }
        }

    }
}

public class appear_times{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k;
        k =  sc.nextInt();

        int m = n/k;
        int[] arr= new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }


        //sorting the array
        

        print_appear obj = new print_appear();
        
        obj.printing(arr, m);

        sc.close();
    }
}
