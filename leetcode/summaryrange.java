package leetcode;


import java.util.List;
import java.util.ArrayList;


// class Solution{
   
// }

// public class summaryrange {
//      public List<String> summaryRanges(int[] nums){
//         List<String> ans = new ArrayList<>();

//         for(int i=0 ; i<nums.length ; ++i){
//             final int begin = nums[i];
//             while(i+1<nums.length && begin == nums[i]-1)
//                 ++i;

//             final int end = nums[i];
//             if(begin == end){
//                 ans.add(""+begin);
//             }
//             else{
//                 ans.add(""+begin+"->"+end);
//             }
//         }
//         return ans;

//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         for(int i=0 ; i<n ; i++){
//             nums[i] = sc.nextInt();
//         }

//         summaryrange obj = new summaryrange();
//         List<String> result = obj.summaryRanges(nums);
//         System.out.println(result);
//         sc.close();
//     }
    
// }


class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        if (nums.length == 0) {
            return result;
        }
        
        int start = nums[0]; // Initialize the start of the range
        int end = nums[0]; // Initialize the end of the range
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i]; // Expand the range
            } else {
                // Add the range to the result
                result.add(getRangeString(start, end));
                
                // Start a new range
                start = nums[i];
                end = nums[i];
            }
        }
        
        // Add the last range to the result
        result.add(getRangeString(start, end));
        
        return result;
    }
    
    private String getRangeString(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }
}


public class summaryrange {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        
        Solution solution = new Solution();
        List<String> result = solution.summaryRanges(nums);
        
        // String resultString = String.join(", ", result); // Join the list elements with a comma
        
        System.out.println(result);
    }
}