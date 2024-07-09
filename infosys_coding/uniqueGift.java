package infosys_coding;

import java.util.Scanner;

class uniqueGift {

    static int no_of_unqGifts(int n, int k) {
        int count = 0;

        for(int i=1; i<=k ; i++) {
            for(int j=1 ; j<=n ; j++) {
                if(j%i == 0)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the maximum number of possible arrays: ");
        int n = sc.nextInt();

        System.out.println("Enter the length of the arrays: ");
        int k = sc.nextInt();

        System.out.println("The total number of possible arrays: "+ no_of_unqGifts(n, k));

        sc.close();
    }
}