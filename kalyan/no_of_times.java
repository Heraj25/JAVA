package kalyan;

import java.util.Scanner;

public class no_of_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int k= sc.nextInt();
        int count=0;
        for(int j=0 ; j<n ; j++){
            arr[j] = sc.nextInt();
        }

        
        for(int i=0 ; i<n ; i++){
            if(arr[i] == k){
                count = count+1;
            }
        }

        System.out.println("The number "+k+" has appeared in the array for "+count+" no. of times");
        sc.close();
    }
    
}
