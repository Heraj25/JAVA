package tcs_coding;

import java.util.*;

public class secondlargeprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=0 ; i<n ; i++) {
            int number = sc.nextInt();
            if(isPrime(number))
                primes.add(number);
        }

        if(primes.size() < 2)
            System.out.println("There are less than 2 prime numbers");
        else
            Collections.sort(primes, Collections.reverseOrder());
        
        System.out.println(primes.get(1));
        sc.close();
        
    }

    public static boolean isPrime(int n) {
        if(n <= 1)
            return false;

        for(int i=2; i<Math.sqrt(n); i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
