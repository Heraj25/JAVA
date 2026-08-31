package tcs_coding;

import java.util.*;

public class secondLargestPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0 ; i<n ; i++) {
            int number = sc.nextInt();
            if(isPrime(number))
                arr.add(number);
        }

        if(arr.size() < 2)
            System.out.println("There are not enough elements in the arraylist to give a result.");
        else {
            Collections.sort(arr, Collections.reverseOrder());
            System.out.println(arr.get(1));
        }
        
        sc.close();
         
    }

    public static boolean isPrime(int number) {
        if(number <= 1)
            return false;

        for(int i=2; i<=Math.sqrt(number); i++)
            if(number%i == 0)
                return false;

        return true;
    }
}
