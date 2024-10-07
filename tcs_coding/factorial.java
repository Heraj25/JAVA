package tcs_coding;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n=0;

        for(int i=0 ; i<5 ; i++) {
            n = sc.nextLong();
            fact(n);
        }

        sc.close();
    }

    public static void fact(long n) {
        long res = 1;
        for(int i=2; i<= n ; i++)
            res *= i;

        System.out.println(res);
    }
}
