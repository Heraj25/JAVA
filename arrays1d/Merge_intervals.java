package arrays1d;

import java.util.Scanner;

public class Merge_intervals {
    public int[][] merge(int[][] intervals){
        int[][] arr = {{0,0}};
        return arr;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows in the array: ");
        a = sc.nextInt();
        System.out.print("Enter the number of columns in the array: ");
        b = sc.nextInt();

        int[][] arr = new int[a][b];
        System.out.println("\tInput the elements in the 2D Array\t");
        for(int i=0; i<a ; i++){
            for(int j=0 ; j<b ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //create an object to access the public function
        Merge_intervals obj = new Merge_intervals();
        System.out.print(obj.merge(arr));
        sc.close();
    }
    
}
