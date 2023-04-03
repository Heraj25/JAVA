/* 
881. Boats to Save People
Medium
4.3K
110
Companies
You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

 

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
 

Constraints:

1 <= people.length <= 5 * 104
1 <= people[i] <= limit <= 3 * 104

*/


package leetcode;

import java.util.Arrays;
import java.util.Scanner;
class numRescueBoats {
    public int numRescueBoat(int[] people, int limit) {
        int n = people.length;
        int count=0;
        Arrays.sort(people); //time complexity O(n log n)
        
        int i=0;
        int j = n-1;

        while(i <= j){
            if(people[i]+people[j] <= limit){
                i++;
                j--;
            }
            else{
                j--;
            }
            count++;
        }
        

        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int limit = sc.nextInt();

        numRescueBoats obj = new numRescueBoats();
        System.out.println(obj.numRescueBoat(arr,limit));
        sc.close();
    }
}