package arrays1d;

import java.util.*;
public class words {
    public static void main(String[] args) {
        // String name1 = "heraj";
        // String name2 = "raj";

        // int count1 = name1.length();
        // System.out.println(count1);

        // // int count2 = name2.length();
        // int i;
        // for(i=0; i<count1 ; i++) {
        //     if(name1.contains(name2)){
        //         System.out.println("The substring matches");
        //         break;
        //     }
        //     else    
        //         continue;
        // }

        // if(i == count1) {
        //     System.out.println("There is no matching substring.");
        // }

        String name;

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the string  : ");
        name = sc.nextLine();

        int count = name.length();

        int[] arr = new int[count];

        for(int i=0 ; i<count ; i++) {
            arr[i] = name.charAt(i);
        }

        //To find whether there is a palindrome present or not
        int start = 0;
        int end = count-1;
        int match=0;
        for(int i=0 ; i<count ; i++) {
            start=i;
            match=0;
            while(start < end) {
                if(arr[start++] == arr[end--]){
                    ++match;
                    continue;
                }
                else
                    break;
                    
            }
            System.out.println(match);
        }
        
        sc.close();
    }
}
