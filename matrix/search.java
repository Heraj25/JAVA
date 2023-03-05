package matrix;

import java.util.Scanner;

public class search {

    public static void main(String[] args) {
        
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //sorting in ascending order
        
        int temp = arr[0][0];
        
        int g=0,h=0;
        for(int d=0 ; d<g ; d++){
            for(int e=0 ; e<h ; e++){
                if(temp > arr[d][++e]){
                    arr[g++][h++] = arr[d][e];
                    arr[d][e] = temp;    
                }
                else{
                        g = g+1;
                        h = h+1;            
            }

        }
    }
        
         
        int a = sc.nextInt();

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(arr[i][j] == a){
                    System.out.println(a);
                }
            }
        }
        sc.close();
    
    }
    
}
