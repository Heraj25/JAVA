package leetcode;



import java.util.Scanner;

public class highaltitude {
    static int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] out = new int[n+1];

        out[0] = 0;
      
        int k=1;

        for(int i=0 ; i<n ; i++){
            out[k++] = gain[i] + out[i];
        }

        int a=0;
        for(int j=0 ; j<n+1 ; j++){
            System.out.println(out[j]);
            if(a < out[j])
                a = out[j];
        }

        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(largestAltitude(arr));
        sc.close();
    }
    
}
