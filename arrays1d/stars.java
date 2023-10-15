package arrays1d;

import java.util.Scanner;

public class stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input number: ");
        int n = sc.nextInt();

        for(int i=0 ; i<n ; i++) {
            for(int j=0; j<n ; j++) {
                System.out.print("*");
            }
        }
    }
    
}
