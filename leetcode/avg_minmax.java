package leetcode;

import java.util.Arrays;
import java.util.Scanner;

class avg_minmax {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        int sum = 0;
        int count = 0;
        
        for(int i=1; i<n-1; i++){
            sum = sum + salary[i];
            count++;
        }
        System.out.println();
        for(int i=0 ; i<n ; i++){
            System.out.println(salary[i]);
        }

        System.out.println();
        
        System.out.println(sum+" "+count);
        double avg=(sum*1.0)/count;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0 ; i<n ; i++){
            arr[i]  = sc.nextInt();
        }

        avg_minmax obj = new avg_minmax();
        sc.close();
        System.out.println(obj.average(arr));
        
    }  
}
