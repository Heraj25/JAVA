import java.util.Scanner;

public class prob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();

        }

        
        int x = sc.nextInt();

        int count=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i] > x){
                count++;
            }

        double prob = (double)count/n;
        sc.close();
        
        System.out.printf("%.1f",prob);
        }

    }
}
