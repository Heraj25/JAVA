package arrays1d;
import java.util.Arrays;

public class distinct_triplet {
    
    // Function to print all distinct triplet in the array with the given sum
    public static void printAllTriplets(int[] nums, int target)
    {
        // sort the array in ascending order
        Arrays.sort(nums);
 
        int n = nums.length;
 
        // check if triplet is formed by nums[i] and a pair from
        // subarray nums[i+1…n)
        for (int i = 0; i <= n - 3; i++)
        {
            // remaining sum
            int k = target - nums[i];
 
            // maintain two indices pointing to endpoints of the subarray nums[i+1…n)
            int low = i + 1;
            int high = nums.length - 1;
 
            // loop if `low` is less than `high`
            while (low < high)
            {
                // increment `low` index if the total is less than the remaining sum
                if (nums[low] + nums[high] < k) {
                    low++;
                }
 
                // decrement `high` index if the total is more than the remaining sum
                else if (nums[low] + nums[high] > k) {
                    high--;
                }
 
                // triplet with the given sum is found
                else {
                    // print the triplet
                    System.out.println("(" + nums[i] + ", " + nums[low] + ", " +
                                        nums[high] + ")");
 
                    // increment `low` index and decrement `high` index
                    low++;
                    high--;
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int target = 6;
 
        printAllTriplets(nums, target);
    }
}
    




/*Output:

(0 1 5)
(0 2 4)
(1 2 3)
*/