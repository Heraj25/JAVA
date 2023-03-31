package arrays1d;

import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;



class triplethash {

    public static boolean tripletexist(int[] arr , int n, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            map.put(arr[i], i);
        }

        for(int i=0 ; i<n-1 ; i++){
            for(int j = i+1 ; j<n ; j++){
                int val = target - (arr[i] + arr[j]);

                if(map.containsKey(val)){
                    if(map.get(val) != i && map.get(val) != j){
                        return true;
                    }
                    
                }
            }
        }

        return false;

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ;i++){
            arr[i] = sc.nextInt();

        }

        int target = sc.nextInt();

        if(tripletexist(arr, n, target)){
            System.out.println("Triplet Exists");
        }

        else{
            System.out.println("Triplet Doesn't Exist");
        }

        sc.close();
    }
    
}
