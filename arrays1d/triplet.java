package arrays1d;


// USING NATIVE RECURSIVE APPROACH

import java.util.Scanner;

class triplet {

        public static boolean istriplet(int[] nums,int n, int target, int count){

            if(count == 3 && target == 0){
                return true;
            }

            if(count == 3 || n == 0 || target < 0){
                return false;
            }

            return istriplet(nums, n-1, target-nums[n-1], count+1) || istriplet(nums, n-1, target, count);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        if(istriplet(arr, n, target, 0)){
            System.out.println("TRIPLET EXISTS");
        }
        else{
            System.out.println("TRIPLET DOESN'T EXIST");
        }

        sc.close();
    

    }
}
