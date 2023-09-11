package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class singlenumber2 {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        int k = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == k)
                count++;
            else {
                if (count == 1)
                    return k;
                else {
                    count = 0;
                    k = nums[i];
                }
            }
        }
        return nums[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        singlenumber2 obj = new singlenumber2();
        System.out.println(obj.singleNumber(nums));
        sc.close();
    }
}
