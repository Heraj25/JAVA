package arrays1d;

import java.util.Scanner;


class arrange{
    
    public void neg(int[] a){
        int temp;
        int j=0;

        for(int i=1 ; i<a.length ; i++){
           
                if(a[i] <0){
                    while(i != j){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                j++;
            }
        
        }  
    }

    public void negative(int[] a){
        for(int l=0 ; l<a.length ; l++){
            System.out.println(a[l]);
        }

    }

}
public class moveneg{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        
        }

        sc.close();
        arrange obj = new arrange();
        System.out.println("The rearranged negative values in the array are: ");
        obj.negative(arr);        
    }
}