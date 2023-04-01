package arrays1d;

import java.util.Scanner;
public class binarysearch {
    public int search(int[] nums, int target) {
        //Binary search method
        int first = 0;
        int last = nums.length-1;
        
     
        while(first <= last){
            int mid = (last+(last - first))/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }

        return -1;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        binarysearch obj = new binarysearch();
        System.out.print(obj.search(arr,x));
        sc.close();
    }
}